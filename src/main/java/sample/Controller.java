package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

public class Controller {
    public Button button;
    private String openPath;
    private File fileOpenPath;
    private FileWriter fileWrite;
    private Stage stage;
    public void initialize(DocFlavor.URL location, ResourceBundle resources)
    {

    }
    public void openFile(ActionEvent actionEvent)
    {
        //文件选择器
        FileChooser fc = new FileChooser();
        //只允许使用txt文件
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
                , new FileChooser.ExtensionFilter("CSV Files", "*.csv")
        );
        //设置标题
        fc.setTitle("Open Resource File...");
        //显示文件选择器对话框(返回文件路径）
        fileOpenPath = fc.showOpenDialog(stage);
        if (fileOpenPath == null)
            return;
        System.out.println(fileOpenPath.getAbsolutePath());
    }
    public void saveFile(ActionEvent actionEvent)
    {
        //文件选择器
        FileChooser fc = new FileChooser();
        //只允许使用txt文件
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
                , new FileChooser.ExtensionFilter("CSV Files", "*.csv")
        );
        //设置标题
        fc.setTitle("Sava File...");
        //保存文件名
        fc.setInitialFileName("想要保存的文件");
        //显示文件选择器对话框(返回文件路径）
        File fileSavePath = fc.showSaveDialog(stage);
        try {
            fileWrite = new FileWriter(fileSavePath, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fileSavePath == null)
            return;
        System.out.println(fileSavePath.getAbsolutePath());
        GGA_Processing.GGA_Processing(fileOpenPath, fileWrite);
    }
}
