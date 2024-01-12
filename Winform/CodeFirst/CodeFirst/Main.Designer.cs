namespace CodeFirst
{
    partial class Main
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridViewProducts = new System.Windows.Forms.DataGridView();
            this.ColumnProductId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewCategories = new System.Windows.Forms.DataGridView();
            this.ColumnCategoryId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewProducts)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCategories)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridViewProducts
            // 
            this.dataGridViewProducts.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewProducts.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ColumnProductId,
            this.dataGridViewTextBoxColumn1});
            this.dataGridViewProducts.Location = new System.Drawing.Point(295, 123);
            this.dataGridViewProducts.Name = "dataGridViewProducts";
            this.dataGridViewProducts.RowTemplate.Height = 25;
            this.dataGridViewProducts.Size = new System.Drawing.Size(493, 315);
            this.dataGridViewProducts.TabIndex = 0;
            // 
            // ColumnProductId
            // 
            this.ColumnProductId.HeaderText = "ProductId";
            this.ColumnProductId.Name = "ColumnProductId";
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.HeaderText = "Name";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.Width = 350;
            // 
            // dataGridViewCategories
            // 
            this.dataGridViewCategories.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewCategories.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ColumnCategoryId,
            this.ColumnName});
            this.dataGridViewCategories.Location = new System.Drawing.Point(-8, 123);
            this.dataGridViewCategories.Name = "dataGridViewCategories";
            this.dataGridViewCategories.RowTemplate.Height = 25;
            this.dataGridViewCategories.Size = new System.Drawing.Size(297, 315);
            this.dataGridViewCategories.TabIndex = 1;
            this.dataGridViewCategories.SelectionChanged += new System.EventHandler(this.dataGridViewCategories_SelectionChanged);
            // 
            // ColumnCategoryId
            // 
            this.ColumnCategoryId.HeaderText = "CategoryId";
            this.ColumnCategoryId.Name = "ColumnCategoryId";
            // 
            // ColumnName
            // 
            this.ColumnName.HeaderText = "Name";
            this.ColumnName.Name = "ColumnName";
            this.ColumnName.Width = 150;
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.dataGridViewCategories);
            this.Controls.Add(this.dataGridViewProducts);
            this.Name = "Main";
            this.Text = "Products And Categories";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewProducts)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewCategories)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private DataGridView dataGridViewProducts;
        private DataGridView dataGridViewCategories;
        private DataGridViewTextBoxColumn ColumnCategoryId;
        private DataGridViewTextBoxColumn ColumnName;
        private DataGridViewTextBoxColumn ColumnProductId;
        private DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
    }
}