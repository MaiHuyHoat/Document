using System.ComponentModel.DataAnnotations;

namespace ConsumeApi.Models.coingecko
{
    public class MarketModel
    {
        [Key]
        public string id { get; set; }
        [Display(Name = "Mã")]
        public string? symbol { get; set; }
        [Display(Name = "Tên Coin")]
        public string? name { get; set; }
        public string? image { get; set; }
        [Display(Name = "Giá")]
        public decimal current_price { get; set; }
        [Display(Name = "Vốn hóa")]
        public long market_cap { get; set; }
        //public long? market_cap_rank { get; set; }
        //public long? fully_diluted_valuation { get; set; }
        //public decimal total_volume { get; set; }
        //public decimal? high_24h { get; set; }
        //public decimal? low_24h { get; set; }
        [Display(Name = "Giá BĐ 24h")]
        public decimal? price_change_24h { get; set; }
        [Display(Name = "Giá BĐ 24h (%)")]
        public decimal? price_change_percentage_24h { get; set; }

        [Display(Name = "Vốn hóa ĐB 24h")]
        public decimal? market_cap_change_24h { get; set; }
        [Display(Name = "Vốn hóa ĐB 24h (%)")]
        public decimal? market_cap_change_percentage_24h { get; set; }
        //public decimal circulating_supply { get; set; }
        //public decimal? total_supply { get; set; }
        //public decimal? max_supply { get; set; }
        //public decimal ath { get; set; }
        //public decimal ath_change_percentage { get; set; }
        //public DateTime ath_date { get; set; }
        //public decimal atl { get; set; }
        //public decimal atl_change_percentage { get; set; }
        //public DateTime atl_date { get; set; }
        //public Roi roi { get; set; }
        //public DateTime last_updated { get; set; }
    }

    public class Roi
    {
        public decimal times { get; set; }
        public string? currency { get; set; }
        public decimal percentage { get; set; }
    }
}
