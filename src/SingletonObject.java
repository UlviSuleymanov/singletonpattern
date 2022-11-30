public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();
    //instance dəyişəninə SingletonObject tipli yeni bir object deyərini ötürdük
    // bu dəyişən static olduğu üçün klassa aiddir və klass load olanda bu object yaranır

    //burda biz objecti private edirik ki bu objecti bu patternden başqa heç cür yaradmaq olmasın
    private SingletonObject(){

    }

    //burada biz objecti qaytaran bir method yaziriq hansiki ancaq və ancaq eyni objecti qaytarır
    //yeni bir object yaratmırıq eyni objectin referansını qaytarırıq.
    public static SingletonObject getInstance(){
        return instance;
    }
    public void test(){
        System.out.println("Bu singleton patterni əsasında qurulmuş objectin methodudur.");
    }
}
