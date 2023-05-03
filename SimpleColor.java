import java.util.Objects;

public class SimpleColor { // Class Invariant: colors are 0-225 inclusive
	private int r;
	private int g;
	private int b;
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		if (r < 0 || r > 255) {
			throw new ColorException();
		} else {
			this.r = r;
		}
	}

	public int getG() {
		return g;
	}

	public void setG(int g) throws ColorException {
		if (g < 0 || g > 255) {
			throw new ColorException();
		} else {
			this.g = g;
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) throws ColorException {
		if (b < 0 || b > 255) {
			throw new ColorException();
		} else {
			this.b = b;
		}
	}

	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}
	public SimpleColor() {}
	
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
	@Override
	public String toString(){
		return "Red = " + r + ", Green = " + g + ", Blue = " + b;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		SimpleColor that = (SimpleColor) o;
		return this.r == that.r && this.g == that.g && this.b == that.b;
	}
}
