package projectStudentManage;

public class Students {
	int stt;
	String hoten,mssv,mamon,tenmon,xeploai;
	double diembt,diemkt,diemck,diemtong;
	
	public Students(int stt, String hoten, String mssv, String mamon, String tenmon, double diembt,
			double diemkt, double diemck, double diemtong, String xeploai) {
		super();
		this.stt = stt;
		this.hoten = hoten;
		this.mssv = mssv;
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.diembt = diembt;
		this.diemkt = diemkt;
		this.diemck = diemck;
		this.diemtong = diemtong;
		this.xeploai = xeploai;
	}
	

	public Students(String hoten, String mssv, String mamon, String tenmon, double diembt,
			double diemkt, double diemck, double diemtong, String xeploai) {
		super();
		this.hoten = hoten;
		this.mssv = mssv;
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.diembt = diembt;
		this.diemkt = diemkt;
		this.diemck = diemck;
		this.diemtong = diemtong;
		this.xeploai = xeploai;
	}



	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getMamon() {
		return mamon;
	}

	public void setMamon(String mamon) {
		this.mamon = mamon;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getXeploai() {
		if(diemtong <= 2) {
			xeploai = "Rớt môn";
		}else if(diemtong <= 5) {
			xeploai = "Trung bình";
		}else if (diemtong >5 && diemtong <= 6.5) {
			xeploai = "Khá";
		}else {
			xeploai = "Giỏi";
		}
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}

	public double getDiembt() {
		return diembt;
	}

	public void setDiembt(double diembt) {
		this.diembt = diembt;
	}

	public double getDiemkt() {
		return diemkt;
	}

	public void setDiemkt(double diemkt) {
		this.diemkt = diemkt;
	}

	public double getDiemck() {
		return diemck;
	}

	public void setDiemck(double diemck) {
		this.diemck = diemck;
	}

	public double getDiemtong() {
		diemtong = (diembt + diemkt*2 + diemck*3)/6;
		return (double)Math.round(diemtong*100)/100;
	}

	public void setDiemtong(double diemtong) {
		this.diemtong = diemtong;
	}

	
}