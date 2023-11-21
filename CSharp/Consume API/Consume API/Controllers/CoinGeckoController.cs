using Consume_API.Models;
using Consume_API.Models.coingecko;
using Consume_API.Service;
using ConsumeApi.Models.coingecko;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace Consume_API.Controllers
{
    public class CoinGeckoController : Controller
    {
        private readonly ICoingeckoService _coingeckoService;
        private readonly ILogger<CoinGeckoController> _logger;
        public CoinGeckoController(ICoingeckoService coingeckoService, ILogger<CoinGeckoController> logger)
        {
            this._coingeckoService = coingeckoService;
            _logger = logger;   
        }

        public async Task<IActionResult> Index(string ids="",string category="")
        {
            _logger.LogDebug("ids: " + ids + " Category: " + category);
          
           var Rsmarket= await _coingeckoService.GetMarketAsync(ids, category);
            var Rscoin = await _coingeckoService.GetCoinListAsync();
            var Rscategory = await _coingeckoService.GetCategoryAsync();
            var model = new DataReturn
            {
                Coins = Rscoin,
                Markets = Rsmarket,
                Categorys = Rscategory,

                CoinList = new SelectList(Rscoin, nameof(CoinModel.id), nameof(CoinModel.name)),
                CategoryList= new SelectList(Rscategory, nameof(CategoryModel.category_id), nameof(CategoryModel.name))

            };
            return View(model);
        }
    }
}
