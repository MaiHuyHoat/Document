using Consume_API.Models;
using ConsumeApi.Models.coingecko;
using Microsoft.Extensions.Configuration;
using Newtonsoft.Json;

namespace Consume_API.Service
{
    public interface ICoingeckoService
    {
        Task<List<CategoryModel>?> GetCategoryAsync();
        Task<List<MarketModel>?> GetMarketAsync(string ids = "", string category = "");
        Task<List<CoinModel>?> GetCoinListAsync();
    }
    public class CoingeckoService : ICoingeckoService
    {
        private readonly IConfiguration _configuration;
        private readonly DatabaseContext _databaseContext;
        private readonly ILogger<CoingeckoService> _logger;   
        private readonly string _coinUrl;
        private readonly string _marketUrl;
        private readonly string _categoryUrl;

        public CoingeckoService(IConfiguration configuration, ILogger<CoingeckoService> logger, DatabaseContext databaseContext)
        {
            _configuration = configuration;
            _logger = logger;
            _databaseContext = databaseContext;
            _coinUrl = _configuration.GetValue<string>("CoingeckoApi:Coins");
            _marketUrl = _configuration.GetValue<string>("CoingeckoApi:Markets");
            _categoryUrl = _configuration.GetValue<string>("CoingeckoApi:Categories");
         
        }
        public  async Task<List<CategoryModel>?> GetCategoryAsync()
        {
            var model=  new List<CategoryModel>();
            var endpoint= $"{_categoryUrl}";
            try
            {
                model = _databaseContext.Categorys.ToList();
                if (model.Count() > 0)
                {
                    _logger.LogInformation("Get Categorys from Database"+endpoint);
                    return   model;
                }
                using(var client = new HttpClient())
                {
                    client.BaseAddress = new Uri(endpoint);
                    var data =await client.GetAsync(endpoint);
                    var result = data.IsSuccessStatusCode ?await data.Content.ReadAsStringAsync() : null;
                    if (result != null)
                    {
                        _logger.LogInformation("Get Markets from URL");
                        model = JsonConvert.DeserializeObject<List<CategoryModel>>(result);
                        _databaseContext.Categorys.AddRange(model);
                        _databaseContext.SaveChanges();
                    } 

                }

            }
            catch (Exception ex)
            {

                _logger.LogError(ex.Message);
            }
            return model;
        }

        public async Task<List<CoinModel>?> GetCoinListAsync()
        {
            var model = new List<CoinModel>();
            var endpoint = $"{_coinUrl}";
            try
            {
                model = _databaseContext.Coins.ToList();
                if (model.Count() > 0)
                {
                    _logger.LogInformation("Get Coin from Database");
                    return model;
                }
                using (var client = new HttpClient())
                {
                    client.BaseAddress = new Uri(endpoint);
                    var data = await client.GetAsync(endpoint);
                    var result = data.IsSuccessStatusCode ? await data.Content.ReadAsStringAsync() : null;
                    if (result != null)
                    {
                        _logger.LogInformation("Get Markets from URL");
                        model = JsonConvert.DeserializeObject<List<CoinModel>>(result);
                        _databaseContext.Coins.AddRange(model);
                        _databaseContext.SaveChanges();
                    }

                }

            }
            catch (Exception ex)
            {

                _logger.LogError(ex.Message);
            }
            return model;
        }

       

        public async Task<List<MarketModel>?> GetMarketAsync(string ids="",string category="")
        {
            var model = new List<MarketModel>();
            var endpoint = $"{_marketUrl}?vs_currency=usd";
            endpoint = !string.IsNullOrEmpty(ids)? $"{endpoint}&ids={ids}": endpoint ;
            endpoint= !string.IsNullOrEmpty(category)?$"{endpoint}&category={category}": endpoint;
            try
            {
               
                using (var client = new HttpClient())
                {
                    client.BaseAddress = new Uri(endpoint);
                    var data = await client.GetAsync(endpoint);
                    var result = data.IsSuccessStatusCode ? await data.Content.ReadAsStringAsync() : null;
                    if (result != null)
                    {
                        _logger.LogInformation("Get Markets from URL");
                        model = JsonConvert.DeserializeObject<List<MarketModel>>(result);
                        _databaseContext.Markets.AddRange(model);
                        _databaseContext.SaveChanges();
                    }

                }

            }
            catch (Exception ex)
            {

                _logger.LogError(ex.Message);
            }
            return model;

        }

      
    }
}
