package com.daokoujinke.common.remoteShell;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class RemoteShellTool {
    private Connection conn;
    private String ipAddr;
    private String charset = Charset.defaultCharset().toString();
    private String username;
    private String password;

    public RemoteShellTool(String ipAddr,String username,String password,String charset){
        this.ipAddr = ipAddr;
        this.username = username;
        this.password = password;
        if (charset != null){
            this.charset = charset;
        }
    }

    public boolean login() throws IOException {
        conn = new Connection(ipAddr);
        conn.connect();
        return conn.authenticateWithPassword(username,password);
    }

    public String execute(String cmds){
        InputStream is = null;
        String result = "";
        try {
            if (this.login()){
                Session session = conn.openSession();
                session.execCommand(cmds);
                is = session.getStdout();
                result = this.processStdout(is,this.charset);
                session.close();
                conn.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String processStdout(InputStream is,String charset){
        byte[] bytes = new byte[1024];
        StringBuffer sb = new StringBuffer();
        try {
            while (is.read(bytes) != -1){
                sb.append(new String(bytes,charset));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
