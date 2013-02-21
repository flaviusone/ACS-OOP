public class TagTok {
	String tokenString;
	private int indexDreapta;
	private int indexStanga;
	private int indexMod;

	public TagTok(String tokenString) {
		this.tokenString = tokenString;
		indexDreapta = 0;
		indexStanga = 0;
		setIndexMod(0);
	}

	public String next() {
		this.indexStanga = this.tokenString.indexOf("<", this.indexDreapta);
		if (this.indexDreapta > 0 && this.indexDreapta != this.indexStanga - 1) {
			int aux = this.indexDreapta;
			this.indexDreapta = this.indexStanga - 1;
			this.indexStanga = aux + 1;
			this.setIndexMod(3);
		} else {
			if (this.tokenString.substring(this.indexStanga,
					this.indexStanga + 2).equals("</")) {
				this.setIndexMod(2);
			} else {
				this.setIndexMod(1);
			}
			this.indexDreapta = this.tokenString.indexOf(">", this.indexStanga);
		}
		return this.tokenString.substring(this.indexStanga,
				this.indexDreapta + 1);
	}

	public boolean hasNext() {
		if (this.tokenString.indexOf("<", this.indexDreapta) >= 0) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public int getIndexMod() {
		return indexMod;
	}

	public void setIndexMod(int indexMod) {
		this.indexMod = indexMod;
	}

}
