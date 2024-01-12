USE [master]
GO
/****** Object:  Database [CodeFirst]    Script Date: 12/17/2023 2:57:10 PM ******/
CREATE DATABASE [CodeFirst]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CodeFirst', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\CodeFirst.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CodeFirst_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\CodeFirst_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [CodeFirst] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CodeFirst].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CodeFirst] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CodeFirst] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CodeFirst] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CodeFirst] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CodeFirst] SET ARITHABORT OFF 
GO
ALTER DATABASE [CodeFirst] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CodeFirst] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CodeFirst] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CodeFirst] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CodeFirst] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CodeFirst] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CodeFirst] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CodeFirst] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CodeFirst] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CodeFirst] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CodeFirst] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CodeFirst] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CodeFirst] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CodeFirst] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CodeFirst] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CodeFirst] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CodeFirst] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CodeFirst] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CodeFirst] SET  MULTI_USER 
GO
ALTER DATABASE [CodeFirst] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CodeFirst] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CodeFirst] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CodeFirst] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CodeFirst] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CodeFirst] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [CodeFirst] SET QUERY_STORE = ON
GO
ALTER DATABASE [CodeFirst] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [CodeFirst]
GO
/****** Object:  User [hoatdfk]    Script Date: 12/17/2023 2:57:10 PM ******/
CREATE USER [hoatdfk] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 12/17/2023 2:57:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](max) NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[CategoryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 12/17/2023 2:57:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[ProductId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](max) NULL,
	[CategoryId] [int] NOT NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED 
(
	[ProductId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Categories] ON 

INSERT [dbo].[Categories] ([CategoryId], [Name]) VALUES (1, N'Cheese')
INSERT [dbo].[Categories] ([CategoryId], [Name]) VALUES (2, N'Meat')
INSERT [dbo].[Categories] ([CategoryId], [Name]) VALUES (3, N'Fish')
INSERT [dbo].[Categories] ([CategoryId], [Name]) VALUES (4, N'Bread')
SET IDENTITY_INSERT [dbo].[Categories] OFF
GO
SET IDENTITY_INSERT [dbo].[Products] ON 

INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (1, N'Cheddar', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (2, N'Brie', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (3, N'Stilton', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (4, N'Cheshire', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (5, N'Swiss', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (6, N'Gruyere', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (7, N'Colby', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (8, N'Mozzela', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (9, N'Ricotta', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (10, N'Parmesan', 1)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (11, N'Ham', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (12, N'Beef', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (13, N'Chicken', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (14, N'Turkey', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (15, N'Prosciutto', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (16, N'Bacon', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (17, N'Mutton', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (18, N'Pastrami', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (19, N'Hazlet', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (20, N'Salami', 2)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (21, N'Salmon', 3)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (22, N'Tuna', 3)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (23, N'Mackerel', 3)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (24, N'Rye', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (25, N'Wheat', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (26, N'Brioche', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (27, N'Naan', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (28, N'Focaccia', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (29, N'Malted', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (30, N'Sourdough', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (31, N'Corn', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (32, N'White', 4)
INSERT [dbo].[Products] ([ProductId], [Name], [CategoryId]) VALUES (33, N'Soda', 4)
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
/****** Object:  Index [IX_Products_CategoryId]    Script Date: 12/17/2023 2:57:10 PM ******/
CREATE NONCLUSTERED INDEX [IX_Products_CategoryId] ON [dbo].[Products]
(
	[CategoryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_Products_Categories_CategoryId] FOREIGN KEY([CategoryId])
REFERENCES [dbo].[Categories] ([CategoryId])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_Products_Categories_CategoryId]
GO
USE [master]
GO
ALTER DATABASE [CodeFirst] SET  READ_WRITE 
GO
