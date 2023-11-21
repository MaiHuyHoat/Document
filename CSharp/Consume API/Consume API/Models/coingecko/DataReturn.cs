using ConsumeApi.Models.coingecko;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace Consume_API.Models.coingecko
{
    public class DataReturn
    {
      
        public List<CategoryModel> Categorys { get; set; }
        public List<CoinModel> Coins { get; set; }
        public List<MarketModel> Markets { get; set; }

        public SelectList CoinList { get; set; }
        public SelectList CategoryList { get; set; }
        public string? category { get; set; }
        public string? ids { get; set; }
 
    }
}
