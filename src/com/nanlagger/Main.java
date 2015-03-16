package com.nanlagger;

import com.nanlagger.ui.MainWindow;

import javax.swing.*;

public class Main {
    //1. При изменении in_text_field должен автоматически очищаться out_text_field, возможно следует ввести исключение
    // для +/-: при смене знака автоматически менять его и в поле результата.
    //2. При изменении спиннера значения основания системы счисления для поля с результатом, этот результат должен
    // пересчитываться автоматически
    //3. Запретить использование цифровых клавиш, не соответствующих системе счисления.

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                // not worth my time
            }
        }
        MainWindow mainForm = new MainWindow();
    }
}
