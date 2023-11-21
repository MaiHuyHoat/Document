using System.ComponentModel.DataAnnotations;

namespace ConsumeApi.Models.coingecko
{

    public class CategoryModel
    {
        [Key]
        public string? category_id { get; set; }
        public string? name { get; set; }
    }

}