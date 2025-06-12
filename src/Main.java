//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            if (i > 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("종료");
    }
}