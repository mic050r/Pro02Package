package pack03;

class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Object obj) {// Object obj = b와 같다
		Rect p = (Rect) obj;// p는 b객체를 저장한것과 같다.
		if (this.width * this.height == p.width * p.height)
			// this.width, this.height 는 a객체의 멤버
			return true;
		else
			return false;
	}
}
