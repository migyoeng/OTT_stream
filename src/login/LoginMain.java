package login;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerData[] customers = new CustomerData[10];

        customers[0] = new CustomerData("정미경", "asdf", "1234");
        int index = 1;

        //로그인 화면
        while(true){
            System.out.print("OTTiverse에 오신 것을 환영합니다. \n 1. 회원가입 | 2. 로그인 | 3. 종료\n선택->");
            int choice = sc.nextInt();
            sc.nextLine();

            //회원 가입 시작
            if(choice == 1){
                System.out.println("회원가입을 도와드리겠습니다.");
                System.out.print("이름: ");
                String newName = sc.nextLine();
                System.out.print("아이디: ");
                String newId = sc.nextLine();
                System.out.print("비밀번호: ");
                String newPassword = sc.nextLine();

                CustomerData customer = new CustomerData(newName, newId, newPassword);
                customers[index] = customer;
                index++;
                System.out.println("회원가입이 성공적으로 완료되었습니다. 로그인 후 이용해주세요.");
                continue;
            } //회원 가입 끝

            //로그인 시작
            else if(choice == 2){
                System.out.print("아이디: ");
                String userId = sc.nextLine();

                for(int i = 0; i < index; i++){
                    if(userId.equals(customers[i].userId)){
                        break;
                    } else{
                        System.out.println("아이디를 잘 못 입력하셨습니다. 다시 한번 확인해주세요.");
                    }
                }

                System.out.print("비밀번호: ");
                String userPassword = sc.nextLine();

            } //로그인 끝
            else if(choice == 3){
                System.out.print("OTTiverse를 종료합니다.\n이용해주셔서 감사합니다.");
                break;
            } else{
                System.out.println("잘못된 선택입니다. 다시 선택해주세요");
                //회원가입테스트
                for (int i = 0; i < index; i++) {
                    System.out.println("이름:" + customers[i].userName);
                    System.out.println("아이디:" + customers[i].userId);
                    System.out.println("비밀번호:" + customers[i].userPassword);
                }
            }
        }
    }

}
