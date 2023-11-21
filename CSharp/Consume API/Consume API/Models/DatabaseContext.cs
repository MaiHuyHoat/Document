using ConsumeApi.Models.coingecko;
using Microsoft.EntityFrameworkCore;

namespace Consume_API.Models
{
    public class DatabaseContext : DbContext
    {
        public DatabaseContext(DbContextOptions<DatabaseContext> options) : base(options) { }   
        public DbSet<CategoryModel> Categorys { get; set; }
        public DbSet<CoinModel> Coins { get; set; }
        public DbSet<MarketModel> Markets { get; set; }

    }
}
