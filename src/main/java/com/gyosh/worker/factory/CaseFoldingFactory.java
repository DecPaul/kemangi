package com.gyosh.worker.factory;

import com.gyosh.worker.task.CaseFolding;
import com.gyosh.worker.task.Task;

import javax.swing.*;

public class CaseFoldingFactory implements TaskFactory{
    // Singleton
    private static JPanel parameterPanel;

    public CaseFoldingFactory() {
        initParameterPanel();
    }

    public String getDescription() {
        // TODO: real description
        return "Case Folding Description";
    }

    public String getIncludedTask() {
        // TODO: real included task
        return "Case Folding Task";
    }

    public JPanel getParameterPanel() {
        if (parameterPanel == null) {
            initParameterPanel();
        }
        return parameterPanel;
    }

    public Task createTask() {
        return new CaseFolding();
    }

    private void initParameterPanel() {
        parameterPanel = new JPanel();
        parameterPanel.add(new JLabel(NO_PARAMETER));
    }

    public String toString() {
        return CaseFolding.TASK_NAME;
    }
}
