namespace QLMonHoc
{
    partial class Main
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.buttonThem = new System.Windows.Forms.Button();
            this.buttonSua = new System.Windows.Forms.Button();
            this.buttonXoa = new System.Windows.Forms.Button();
            this.dataGridViewQLMonHoc = new System.Windows.Forms.DataGridView();
            this.ColumnMaMon = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnTenMon = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnSoDVHT = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewQLMonHoc)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.label1.Location = new System.Drawing.Point(154, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(183, 30);
            this.label1.TabIndex = 0;
            this.label1.Text = "Quản lý Môn học";
            // 
            // buttonThem
            // 
            this.buttonThem.BackColor = System.Drawing.Color.LawnGreen;
            this.buttonThem.Location = new System.Drawing.Point(55, 100);
            this.buttonThem.Name = "buttonThem";
            this.buttonThem.Size = new System.Drawing.Size(75, 23);
            this.buttonThem.TabIndex = 1;
            this.buttonThem.Text = "Thêm";
            this.buttonThem.UseVisualStyleBackColor = false;
            this.buttonThem.Click += new System.EventHandler(this.buttonThem_Click);
            // 
            // buttonSua
            // 
            this.buttonSua.BackColor = System.Drawing.Color.OrangeRed;
            this.buttonSua.Location = new System.Drawing.Point(196, 100);
            this.buttonSua.Name = "buttonSua";
            this.buttonSua.Size = new System.Drawing.Size(75, 23);
            this.buttonSua.TabIndex = 2;
            this.buttonSua.Text = "Sửa";
            this.buttonSua.UseVisualStyleBackColor = false;
            this.buttonSua.Click += new System.EventHandler(this.buttonSua_Click);
            // 
            // buttonXoa
            // 
            this.buttonXoa.BackColor = System.Drawing.Color.Red;
            this.buttonXoa.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.buttonXoa.Location = new System.Drawing.Point(347, 100);
            this.buttonXoa.Name = "buttonXoa";
            this.buttonXoa.Size = new System.Drawing.Size(75, 23);
            this.buttonXoa.TabIndex = 3;
            this.buttonXoa.Text = "Xoá";
            this.buttonXoa.UseVisualStyleBackColor = false;
            this.buttonXoa.Click += new System.EventHandler(this.buttonXoa_Click);
            // 
            // dataGridViewQLMonHoc
            // 
            this.dataGridViewQLMonHoc.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewQLMonHoc.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ColumnMaMon,
            this.ColumnTenMon,
            this.ColumnSoDVHT});
            this.dataGridViewQLMonHoc.Location = new System.Drawing.Point(16, 165);
            this.dataGridViewQLMonHoc.Name = "dataGridViewQLMonHoc";
            this.dataGridViewQLMonHoc.RowTemplate.Height = 25;
            this.dataGridViewQLMonHoc.Size = new System.Drawing.Size(446, 257);
            this.dataGridViewQLMonHoc.TabIndex = 4;
            // 
            // ColumnMaMon
            // 
            this.ColumnMaMon.HeaderText = "Mã môn";
            this.ColumnMaMon.Name = "ColumnMaMon";
            // 
            // ColumnTenMon
            // 
            this.ColumnTenMon.HeaderText = "Tên môn";
            this.ColumnTenMon.Name = "ColumnTenMon";
            this.ColumnTenMon.Width = 200;
            // 
            // ColumnSoDVHT
            // 
            this.ColumnSoDVHT.HeaderText = "SoDVHT";
            this.ColumnSoDVHT.Name = "ColumnSoDVHT";
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(474, 450);
            this.Controls.Add(this.dataGridViewQLMonHoc);
            this.Controls.Add(this.buttonXoa);
            this.Controls.Add(this.buttonSua);
            this.Controls.Add(this.buttonThem);
            this.Controls.Add(this.label1);
            this.Name = "Main";
            this.Text = "Main";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewQLMonHoc)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private Label label1;
        private Button buttonThem;
        private Button buttonSua;
        private Button buttonXoa;
        private DataGridView dataGridViewQLMonHoc;
        private DataGridViewTextBoxColumn ColumnMaMon;
        private DataGridViewTextBoxColumn ColumnTenMon;
        private DataGridViewTextBoxColumn ColumnSoDVHT;
    }
}