package com.psl.ques4;

public class Question4 {
	
	public String swap(String a, int i, int j){
		char temp;
		char[] chararray=a.toCharArray();
		temp=chararray[i];
		chararray[i]=chararray[j];
		chararray[j]=temp;
		return String.valueOf(chararray);
	}
	
	
	private void permute(String str, int l, int h){
		if(l==h)
			System.out.println(str);
		else
		{
			for(int i=l; i<=h; i++){
				str=swap(str,l,i);
				permute(str,l+1,h);
				str=swap(str,l,i);
			}
			
		}
	}
	
	public static void main(String[] args){
		
		String str="123";
		int n=str.length();
		
		Question4 perm=new Question4();
		perm.permute(str, 0, n-1);
		
	}

}
