namespace KiemTra
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle6 = new System.Windows.Forms.DataGridViewCellStyle();
            this.label1 = new System.Windows.Forms.Label();
            this.dataGridViewShow = new System.Windows.Forms.DataGridView();
            this.ColumnMaSinhVien = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnTen = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnNgaySinh = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnTenLop = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ColumnTenKhoa = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.buttonThem = new System.Windows.Forms.Button();
            this.buttonSua = new System.Windows.Forms.Button();
            this.buttonXoa = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.comboBoxKhoa = new System.Windows.Forms.ComboBox();
            this.comboBoxLop = new System.Windows.Forms.ComboBox();
            this.dateTimePickerSinhNhatTu = new System.Windows.Forms.DateTimePicker();
            this.dateTimePickerSinhNhatDen = new System.Windows.Forms.DateTimePicker();
            this.textBoxMaSinhVien = new System.Windows.Forms.TextBox();
            this.textBoxHoTen = new System.Windows.Forms.TextBox();
            this.buttonNapLai = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewShow)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label1.Location = new System.Drawing.Point(309, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(172, 24);
            this.label1.TabIndex = 0;
            this.label1.Text = "Quản lý sinh viên";
            // 
            // dataGridViewShow
            // 
            dataGridViewCellStyle4.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle4.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle4.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            dataGridViewCellStyle4.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle4.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle4.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle4.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dataGridViewShow.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle4;
            this.dataGridViewShow.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewShow.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ColumnMaSinhVien,
            this.ColumnTen,
            this.ColumnNgaySinh,
            this.ColumnTenLop,
            this.ColumnTenKhoa});
            dataGridViewCellStyle5.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle5.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle5.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            dataGridViewCellStyle5.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle5.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle5.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle5.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dataGridViewShow.DefaultCellStyle = dataGridViewCellStyle5;
            this.dataGridViewShow.Location = new System.Drawing.Point(135, 202);
            this.dataGridViewShow.Name = "dataGridViewShow";
            dataGridViewCellStyle6.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle6.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle6.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            dataGridViewCellStyle6.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle6.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle6.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle6.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dataGridViewShow.RowHeadersDefaultCellStyle = dataGridViewCellStyle6;
            this.dataGridViewShow.Size = new System.Drawing.Size(647, 263);
            this.dataGridViewShow.TabIndex = 1;
            // 
            // ColumnMaSinhVien
            // 
            this.ColumnMaSinhVien.HeaderText = "Mã sinh viên";
            this.ColumnMaSinhVien.Name = "ColumnMaSinhVien";
            // 
            // ColumnTen
            // 
            this.ColumnTen.HeaderText = "Tên";
            this.ColumnTen.Name = "ColumnTen";
            this.ColumnTen.Width = 200;
            // 
            // ColumnNgaySinh
            // 
            this.ColumnNgaySinh.HeaderText = "Ngày Sinh";
            this.ColumnNgaySinh.Name = "ColumnNgaySinh";
            // 
            // ColumnTenLop
            // 
            this.ColumnTenLop.HeaderText = "Tên lớp";
            this.ColumnTenLop.Name = "ColumnTenLop";
            // 
            // ColumnTenKhoa
            // 
            this.ColumnTenKhoa.HeaderText = "Tên Khoa";
            this.ColumnTenKhoa.Name = "ColumnTenKhoa";
            // 
            // buttonThem
            // 
            this.buttonThem.BackColor = System.Drawing.Color.DodgerBlue;
            this.buttonThem.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.buttonThem.Location = new System.Drawing.Point(22, 311);
            this.buttonThem.Name = "buttonThem";
            this.buttonThem.Size = new System.Drawing.Size(75, 23);
            this.buttonThem.TabIndex = 2;
            this.buttonThem.Text = "Thêm ";
            this.buttonThem.UseVisualStyleBackColor = false;
            this.buttonThem.Click += new System.EventHandler(this.buttonThem_Click);
            // 
            // buttonSua
            // 
            this.buttonSua.BackColor = System.Drawing.Color.DarkOrange;
            this.buttonSua.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.buttonSua.Location = new System.Drawing.Point(22, 372);
            this.buttonSua.Name = "buttonSua";
            this.buttonSua.Size = new System.Drawing.Size(75, 23);
            this.buttonSua.TabIndex = 3;
            this.buttonSua.Text = "Sửa";
            this.buttonSua.UseVisualStyleBackColor = false;
            this.buttonSua.Click += new System.EventHandler(this.buttonSua_Click);
            // 
            // buttonXoa
            // 
            this.buttonXoa.BackColor = System.Drawing.Color.Crimson;
            this.buttonXoa.ForeColor = System.Drawing.SystemColors.InactiveBorder;
            this.buttonXoa.Location = new System.Drawing.Point(22, 426);
            this.buttonXoa.Name = "buttonXoa";
            this.buttonXoa.Size = new System.Drawing.Size(75, 23);
            this.buttonXoa.TabIndex = 4;
            this.buttonXoa.Text = "Xoá";
            this.buttonXoa.UseVisualStyleBackColor = false;
            this.buttonXoa.Click += new System.EventHandler(this.buttonXoa_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label2.Location = new System.Drawing.Point(64, 68);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 15);
            this.label2.TabIndex = 5;
            this.label2.Text = "Mã sinh viên : ";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label3.Location = new System.Drawing.Point(64, 108);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(98, 15);
            this.label3.TabIndex = 6;
            this.label3.Text = "Sinh từ ngày : ";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label4.Location = new System.Drawing.Point(108, 160);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(48, 13);
            this.label4.TabIndex = 7;
            this.label4.Text = "Khoa : ";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label5.Location = new System.Drawing.Point(376, 152);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(40, 13);
            this.label5.TabIndex = 10;
            this.label5.Text = "Lớp : ";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label6.Location = new System.Drawing.Point(376, 110);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(42, 13);
            this.label6.TabIndex = 9;
            this.label6.Text = "Đến : ";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label7.Location = new System.Drawing.Point(373, 70);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(57, 13);
            this.label7.TabIndex = 8;
            this.label7.Text = "Họ tên : ";
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.button1.Location = new System.Drawing.Point(669, 86);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(88, 79);
            this.button1.TabIndex = 11;
            this.button1.Text = "Tìm kiếm";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // comboBoxKhoa
            // 
            this.comboBoxKhoa.FormattingEnabled = true;
            this.comboBoxKhoa.Location = new System.Drawing.Point(162, 152);
            this.comboBoxKhoa.Name = "comboBoxKhoa";
            this.comboBoxKhoa.Size = new System.Drawing.Size(180, 21);
            this.comboBoxKhoa.TabIndex = 12;
            this.comboBoxKhoa.SelectedIndexChanged += new System.EventHandler(this.comboBoxKhoa_SelectedIndexChanged);
            // 
            // comboBoxLop
            // 
            this.comboBoxLop.FormattingEnabled = true;
            this.comboBoxLop.Location = new System.Drawing.Point(425, 152);
            this.comboBoxLop.Name = "comboBoxLop";
            this.comboBoxLop.Size = new System.Drawing.Size(200, 21);
            this.comboBoxLop.TabIndex = 13;
            // 
            // dateTimePickerSinhNhatTu
            // 
            this.dateTimePickerSinhNhatTu.Location = new System.Drawing.Point(162, 108);
            this.dateTimePickerSinhNhatTu.Name = "dateTimePickerSinhNhatTu";
            this.dateTimePickerSinhNhatTu.Size = new System.Drawing.Size(180, 20);
            this.dateTimePickerSinhNhatTu.TabIndex = 14;
            // 
            // dateTimePickerSinhNhatDen
            // 
            this.dateTimePickerSinhNhatDen.Location = new System.Drawing.Point(425, 108);
            this.dateTimePickerSinhNhatDen.Name = "dateTimePickerSinhNhatDen";
            this.dateTimePickerSinhNhatDen.Size = new System.Drawing.Size(200, 20);
            this.dateTimePickerSinhNhatDen.TabIndex = 15;
            // 
            // textBoxMaSinhVien
            // 
            this.textBoxMaSinhVien.Location = new System.Drawing.Point(162, 68);
            this.textBoxMaSinhVien.Name = "textBoxMaSinhVien";
            this.textBoxMaSinhVien.Size = new System.Drawing.Size(180, 20);
            this.textBoxMaSinhVien.TabIndex = 16;
            // 
            // textBoxHoTen
            // 
            this.textBoxHoTen.Location = new System.Drawing.Point(425, 67);
            this.textBoxHoTen.Name = "textBoxHoTen";
            this.textBoxHoTen.Size = new System.Drawing.Size(200, 20);
            this.textBoxHoTen.TabIndex = 17;
            // 
            // buttonNapLai
            // 
            this.buttonNapLai.BackColor = System.Drawing.Color.ForestGreen;
            this.buttonNapLai.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.buttonNapLai.Location = new System.Drawing.Point(22, 256);
            this.buttonNapLai.Name = "buttonNapLai";
            this.buttonNapLai.Size = new System.Drawing.Size(75, 23);
            this.buttonNapLai.TabIndex = 18;
            this.buttonNapLai.Text = "Nạp lại";
            this.buttonNapLai.UseVisualStyleBackColor = false;
            this.buttonNapLai.Click += new System.EventHandler(this.buttonNapLai_Click);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(808, 488);
            this.Controls.Add(this.buttonNapLai);
            this.Controls.Add(this.textBoxHoTen);
            this.Controls.Add(this.textBoxMaSinhVien);
            this.Controls.Add(this.dateTimePickerSinhNhatDen);
            this.Controls.Add(this.dateTimePickerSinhNhatTu);
            this.Controls.Add(this.comboBoxLop);
            this.Controls.Add(this.comboBoxKhoa);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.buttonXoa);
            this.Controls.Add(this.buttonSua);
            this.Controls.Add(this.buttonThem);
            this.Controls.Add(this.dataGridViewShow);
            this.Controls.Add(this.label1);
            this.Name = "Main";
            this.Text = "Main";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewShow)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView dataGridViewShow;
        private System.Windows.Forms.DataGridViewTextBoxColumn ColumnMaSinhVien;
        private System.Windows.Forms.DataGridViewTextBoxColumn ColumnTen;
        private System.Windows.Forms.DataGridViewTextBoxColumn ColumnNgaySinh;
        private System.Windows.Forms.DataGridViewTextBoxColumn ColumnTenLop;
        private System.Windows.Forms.DataGridViewTextBoxColumn ColumnTenKhoa;
        private System.Windows.Forms.Button buttonThem;
        private System.Windows.Forms.Button buttonSua;
        private System.Windows.Forms.Button buttonXoa;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.ComboBox comboBoxKhoa;
        private System.Windows.Forms.ComboBox comboBoxLop;
        private System.Windows.Forms.DateTimePicker dateTimePickerSinhNhatTu;
        private System.Windows.Forms.DateTimePicker dateTimePickerSinhNhatDen;
        private System.Windows.Forms.TextBox textBoxMaSinhVien;
        private System.Windows.Forms.TextBox textBoxHoTen;
        private System.Windows.Forms.Button buttonNapLai;
    }
}

