using System.ComponentModel.DataAnnotations;

namespace ConsumeApi.Models.coingecko
{
    public class CoinModel
    {
        [Key]
        public string? id { get; set; }
        public string? symbol { get; set; }
        public string? name { get; set; }
    }
}
