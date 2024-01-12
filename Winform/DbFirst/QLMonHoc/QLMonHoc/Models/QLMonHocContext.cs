using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata;

namespace QLMonHoc.Models
{
    public partial class QLMonHocContext : DbContext
    {
        public QLMonHocContext()
        {
        }

        public QLMonHocContext(DbContextOptions<QLMonHocContext> options)
            : base(options)
        {
        }

        public virtual DbSet<MonHoc> MonHocs { get; set; } = null!;

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
                optionsBuilder.UseSqlServer("Data Source=.;Initial Catalog=QLMonHoc;Integrated Security=True");
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<MonHoc>(entity =>
            {
                entity.HasKey(e => e.MaMon)
                    .HasName("PK__MonHocs__3A5B29A82E6355EC");

                entity.Property(e => e.SoDvht).HasColumnName("SoDVHT");

                entity.Property(e => e.TenMon).HasMaxLength(200);
            });

            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
    }
}
