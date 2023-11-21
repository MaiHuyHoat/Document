﻿// <auto-generated />
using System;
using Consume_API.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace Consume_API.Migrations
{
    [DbContext(typeof(DatabaseContext))]
    [Migration("20230325031028_InitDb")]
    partial class InitDb
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder.HasAnnotation("ProductVersion", "7.0.4");

            modelBuilder.Entity("ConsumeApi.Models.coingecko.CategoryModel", b =>
                {
                    b.Property<string>("category_id")
                        .HasColumnType("TEXT");

                    b.Property<string>("name")
                        .HasColumnType("TEXT");

                    b.HasKey("category_id");

                    b.ToTable("Categorys");
                });

            modelBuilder.Entity("ConsumeApi.Models.coingecko.CoinModel", b =>
                {
                    b.Property<string>("id")
                        .HasColumnType("TEXT");

                    b.Property<string>("name")
                        .HasColumnType("TEXT");

                    b.Property<string>("symbol")
                        .HasColumnType("TEXT");

                    b.HasKey("id");

                    b.ToTable("Coins");
                });

            modelBuilder.Entity("ConsumeApi.Models.coingecko.MarketModel", b =>
                {
                    b.Property<string>("id")
                        .HasColumnType("TEXT");

                    b.Property<decimal>("current_price")
                        .HasColumnType("TEXT");

                    b.Property<string>("image")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.Property<long>("market_cap")
                        .HasColumnType("INTEGER");

                    b.Property<decimal?>("market_cap_change_24h")
                        .HasColumnType("TEXT");

                    b.Property<decimal?>("market_cap_change_percentage_24h")
                        .HasColumnType("TEXT");

                    b.Property<string>("name")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.Property<decimal?>("price_change_24h")
                        .HasColumnType("TEXT");

                    b.Property<decimal?>("price_change_percentage_24h")
                        .HasColumnType("TEXT");

                    b.Property<string>("symbol")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.HasKey("id");

                    b.ToTable("Markets");
                });
#pragma warning restore 612, 618
        }
    }
}
