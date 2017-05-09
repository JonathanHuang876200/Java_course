package oo.stati;

public class Student {   /* 不寫public */
	 public int english;
	public int chinese;
	public int math;
	static int pass = 60;
	
	
	static {
		System.out.println("STATIC!!");
		/*System.out.println(english);無法執行因為static是在物件生成前就有了*/
		System.out.println(pass);/*因為pass也是static的部分*/
	}

	public Student(int english, int chinese, int math) {  /*假如public不寫，則只能在同package使用*/
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}
	public Student(){
		
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math));
	}

	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
	@Override
	public String toString(){
		return
				"eng:"+english+"\n"+
				"chinese:"+chinese+"\n"+
				"math:"+math+"\n";
	}
}
