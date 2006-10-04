/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd;

import java.util.Map;

public class RuleContext {

    private Report report = new Report();
    private String sourceCodeFilename;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public String getSourceCodeFilename() {
        return sourceCodeFilename;
    }

    public void setSourceCodeFilename(String filename) {
        this.sourceCodeFilename = filename;
    }

    public void excludeLines(Map lines) {
        report.exclude(lines);
    }
}
