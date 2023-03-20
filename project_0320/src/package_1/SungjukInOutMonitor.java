package package_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SungjukInOutMonitor {

	public static void main(String[] args) {
		try {
			String inName = "sungjukIn/sungjuk.txt"; // 입력파일
			String outName = "sungjukIn/result.txt"; // 출력파일
			
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] eng = new int[5];
			int[] mat = new int[5];
			int[] avg = new int[5];
			int[] rank = new int[5];
			int size = name.length;
			
			FileReader in = new FileReader(inName);
			
			BufferedReader br = new BufferedReader(in);
			
			int idx = 0;
			String line = null; // 초기값 설정
			
			while(true) {
				line = br.readLine();
				if(line == null) break;
				System.out.println(line);
				
				StringTokenizer st = new StringTokenizer(line, ",");
				while(st.hasMoreElements()) {
					name[idx] = st.nextToken();
					kor[idx] = Integer.parseInt(st.nextToken());
					eng[idx] = Integer.parseInt(st.nextToken());
					mat[idx] = Integer.parseInt(st.nextToken());
				}
				idx++;
			}
			// 평균
			for(int a = 0; a < size; a++) {
				avg[a] = (kor[a]+eng[a]+mat[a])/3;
			}
			//등수
			for(int a = 0; a < size; a++) {
				for(int b = 0; b < size; b++) {
					if(avg[a] < avg[b]) {
						rank[a]++;
					}
				}
			}
			
			FileWriter fw = new FileWriter(outName);
			PrintWriter out = new PrintWriter(fw, false);
			out.println("**********성 / 적 / 결 / 과**********");
			out.println("-----------------------------------");
			out.println("  이름   국어  영어  수학  평균  등수  결과");
			out.println("-----------------------------------");
			
			for(idx = 0; idx < size; idx++) {
				out.printf("%4s %4d %4d %4d %4d %3d",
						name[idx], kor[idx], eng[idx], mat[idx], avg[idx], rank[idx]+1);
				out.println();
			}
			out.println("-----------------------------------");
			
			in.close();  br.close();
			fw.close(); out.close();
		} catch(IOException e) {
			System.out.println("실패 " + e);
		}
	}

}
