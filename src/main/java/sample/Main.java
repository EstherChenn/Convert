package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXDrawersStack;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

import static javafx.scene.input.MouseEvent.MOUSE_PRESSED;

public class Main extends Application {

    private String openPath;
    private File fileOpenPath;
    private FileWriter fileWrite;
    private final Desktop desktop = Desktop.getDesktop();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        stage.setTitle("GGA_Convert");
        Scene scene = new Scene(root, 280, 80);
        scene.getStylesheets().add(Main.class.getResource("/css/jfoenix-components.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
/*
        FlowPane content = new FlowPane();
        JFXButton j1 = new JFXButton("打开文件");
        JFXButton j2 = new JFXButton("保存");

        content.getChildren().addAll(j1, j2);
        content.setMaxSize(200, 200);


        JFXDrawersStack drawersStack = new JFXDrawersStack();
        drawersStack.setContent(content);

        j1.getStyleClass().add("button-raised");
        j2.getStyleClass().add("button-raised");
        j1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
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
        });
        j2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
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
        });
        final Scene scene = new Scene(drawersStack, 300, 100);
        final ObservableList<String> stylesheets = scene.getStylesheets();
        stylesheets.addAll(Main.class.getResource("/css/jfoenix-button.css").toExternalForm());

        //窗口的名字
        stage.setTitle("GGA_Convert");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();*/
      /*  AnchorPane an = new AnchorPane();
        VBox vbox = new VBox(10);

        Button b1 = new Button("单选文件窗口");
        Button b2 = new Button("保存文本");

        vbox.getChildren().addAll(j1,j2);
        an.getChildren().add(vbox);

        AnchorPane.setTopAnchor(vbox,500.0);
        AnchorPane.setLeftAnchor(vbox,100.0);

        Scene scene=new Scene(an);
        scene.getStylesheets().add(Main.class.getResource("/css/jfoenix-components.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("GGA_Convert");
        stage.setHeight(200);
        stage.setWidth(400);
        stage.show();

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //文件选择器
                FileChooser fc = new FileChooser();
                //只允许使用txt文件
                fc.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                        ,new FileChooser.ExtensionFilter("CSV Files", "*.csv")
                );
                //设置标题
                fc.setTitle("Open Resource File...");
                //显示文件选择器对话框(返回文件路径）
                fileOpenPath = fc.showOpenDialog(stage);
                if(fileOpenPath == null)
                    return;
                System.out.println(fileOpenPath.getAbsolutePath());
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //文件选择器
                FileChooser fc = new FileChooser();
                //只允许使用txt文件
                fc.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                        ,new FileChooser.ExtensionFilter("CSV Files", "*.csv")
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
                if(fileSavePath == null)
                    return;
                System.out.println(fileSavePath.getAbsolutePath());
                GGA_Processing.GGA_Processing(fileOpenPath, fileWrite);
                *//*try {
                   // filePath.createNewFile();
                    FileOutputStream fos = new FileOutputStream(fileSavePath);
                    OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
                    osw.write("12345678");
                    osw.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }*//*
            }
        });*/

       /* Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        //窗口的名字
        stage.setTitle("GGA_Convert");
        //设置窗口大小
        Scene scene = new Scene(root, 900, 500);
        // 设置宽高尺寸可调整，true:可以拖拽边缘调整窗口尺寸，false：不可调整
        stage.setResizable(true);
        scene.getStylesheets().add(Main.class.getResource("/css/jfoenix-components.css").toExternalForm());
        //文件选择器
        FileChooser fileChooser = new FileChooser();
        //只允许使用txt文件
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
                ,new FileChooser.ExtensionFilter("CSV Files", "*.csv")
        );
        fileChooser.setTitle("Open Resource File");
        //显示文件选择器对话框
        fileChooser.showOpenDialog(stage);

        final Button openButton = new Button("Open a Picture...");

        openButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(final ActionEvent e) {
                        File file = fileChooser.showOpenDialog(stage);
                        if (file != null) {
                            openFile(file);
                        }
                    }
                });

        VBox vBox = new VBox(openButton);


        stage.setScene(scene);
        stage.show();*/
    }


    public static void main(String[] args) {
        //启动软件
        launch(args);
    }


    /*private void openFile(File file) {
        EventQueue.invokeLater(() -> {
            try {
                desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(FileChooserSample.
                        class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        });
    }*/
}
