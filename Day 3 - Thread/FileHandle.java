package Threads2;

public class FileHandle implements Runnable{


    private String type;
    private String content;
    private String filePath;
    public FileHandle(String type, String content, String filePath){
        this.type = type;
        this.content = content;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        if(type.equals("IO")){
            try {
                FileUtils.writeFileAppendIO(filePath, content);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (type.equals("NIO")) {
            FileUtils.writeFileAppendNIO(filePath, content);
        }
    }
}
