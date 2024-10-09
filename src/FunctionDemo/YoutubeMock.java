package FunctionDemo;

public class YoutubeMock {

    // Sign
    public static boolean  signIn(String username,String password){
        if(username.equals("malav")){
           return  true;
        }else {
            return  false;
        }
    }

    // Upload Video
    public  static  boolean uploadVideo(String videoName,String username){
        boolean signInSuccess  = signIn(username,"123");
        if (signInSuccess){
            System.out.println("Uploading Video....");
        }else {
            return false;
        }
        return  true;
    }


    public static void main(String[] args) {
        boolean success = uploadVideo("Maths","malav");
        if(success){
            System.out.println("Video Uploaded Successfully");
        }else {
            System.out.println("Something went Wrong");
        }

    }
}
