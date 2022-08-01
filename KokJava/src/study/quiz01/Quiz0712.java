package study.quiz01;

public class Quiz0712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] degit = {2200,1400,3200,2900,4500,3000,800,3400};
		int sum =0; 
		
		for(int i=0; i<degit.length;i++) {
			if(degit[i] <= 2000) {
				sum += degit[i];
			}
		}
		System.out.println("2000ÀÌÇÏ ±Ý¾×ÀÇ ÇÕ: " + sum);
		
		String[] local = {"ÇÑ±¹","±¤ÁÖ","¼­¿ï","ºÎ»ê","ºÏ±¸","³²±¸","¼­±¸","¿ëºÀµ¿","¿ÀÄ¡µ¿"};
		
		for(int i=0;i<local.length;i++) {
			if(local[i]=="ÇÑ±¹") {
				System.out.printf("%s - ",local[i]);
			}else if(local[i]=="±¤ÁÖ") {
				System.out.printf("%s ",local[i]);
			}else if(local[i]=="ºÏ±¸") {
				System.out.printf("%s ",local[i]);
			}else if(local[i]=="¿ëºÀµ¿") {
				System.out.printf("%s \n",local[i]);
			}
		}
		
		for(int i=0;i<local.length;i++) {
			if(local[i]=="ºÏ±¸") {
				local[i] = "±¤»ê±¸";
				System.out.println(local[i]);
			}
		}
		
		for(int i=0;i<local.length;i++) {
			System.out.println(local[i]);
		}

	}

}
