package login;

public class CustomerData {
    //필드
    String userName;
    String userId;
    String userPassword;

    //회원 초기화
    CustomerData(String userName, String userid, String userPassword){
        this.userName = userName;
        this.userId = userid;
        this.userPassword = userPassword;
    }

    CustomerData(){

    }
}
