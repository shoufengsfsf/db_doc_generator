package com.shoufeng.db.doc;

import com.shoufeng.db.doc.utils.MyDocUtil;
import com.shoufeng.db.doc.utils.MyExcelUtil;

public class DocGenerator {
    public static void main(String[] args) throws Exception {
        MyDocUtil.exportDbDoc("xxx数据库文档.docx");
        MyExcelUtil.exportDbExcel();
    }

}
