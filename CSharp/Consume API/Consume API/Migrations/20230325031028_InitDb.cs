using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Consume_API.Migrations
{
    /// <inheritdoc />
    public partial class InitDb : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Categorys",
                columns: table => new
                {
                    category_id = table.Column<string>(type: "TEXT", nullable: false),
                    name = table.Column<string>(type: "TEXT", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Categorys", x => x.category_id);
                });

            migrationBuilder.CreateTable(
                name: "Coins",
                columns: table => new
                {
                    id = table.Column<string>(type: "TEXT", nullable: false),
                    symbol = table.Column<string>(type: "TEXT", nullable: true),
                    name = table.Column<string>(type: "TEXT", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Coins", x => x.id);
                });

            migrationBuilder.CreateTable(
                name: "Markets",
                columns: table => new
                {
                    id = table.Column<string>(type: "TEXT", nullable: false),
                    symbol = table.Column<string>(type: "TEXT", nullable: false),
                    name = table.Column<string>(type: "TEXT", nullable: false),
                    image = table.Column<string>(type: "TEXT", nullable: false),
                    current_price = table.Column<decimal>(type: "TEXT", nullable: false),
                    market_cap = table.Column<long>(type: "INTEGER", nullable: false),
                    price_change_24h = table.Column<decimal>(type: "TEXT", nullable: true),
                    price_change_percentage_24h = table.Column<decimal>(type: "TEXT", nullable: true),
                    market_cap_change_24h = table.Column<decimal>(type: "TEXT", nullable: true),
                    market_cap_change_percentage_24h = table.Column<decimal>(type: "TEXT", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Markets", x => x.id);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Categorys");

            migrationBuilder.DropTable(
                name: "Coins");

            migrationBuilder.DropTable(
                name: "Markets");
        }
    }
}
