package com.accp.action.lt;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091700532875";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWTBM+4aprrtB3n34Vg5Mv4/3svDdEgCU2J2fbn/3FOXMHNXZXZ4XgDwiaY/MDimaelwSyumnp5P9HMt0qIcuEZ1cmGn34qoIGrSLmb9Onaj8eJbV6gHBNl6ttsryegDJz37lnnFb0d+DAe2X6e9RdaxUOmitf8XReFWNRwQiztsdk3Z1Nz6eVurkURB1X6tcfkBqlNMi/5L8yVL/6RVvda3Zcj2iagzM74REZT74xZIpKJALQm4wzrmyY0gctyl77ynPkb27Z6O82OJEg/mOhsyLpfg08WvEGH+QIIKl9wLzmMftDhEhVG8Xoq9HR7UkqYLn47y0189MrDq5QwL49AgMBAAECggEAF293VMfFVhMlKHHzLBGfIsmPL5nNmF3O75nHZQSWgmlJ2WbptAlNY7mUYtaQ7w1moPX1YpUUrMbrU0PIHqi0Xknq2eMpn1ue+MGIfpwTSbiUbPP+T0K1wDOVJH7JUIG23ECXXWOQX4BNyFW1ehBS9dobp3I8rzIsLftxyC6sV7E8RKWwL7l30BVUijLgadNDPSetHYLKtAziapS05bmqb2vEX6swvh4jE82srfN6Lrshtt5pTdSCO6QyzxrSC8IgXnVTjK8plOeLMTPhhDa/i43oD1cTtYFGFfMSxDhecrFSeFkx2y4BljFlmExvfPCWIVYsq5prnF/EgHN5bwdr1QKBgQDKS+ZQcITAyqgLpVOiBFDF2/XKucU74a+Jm4sLzdgJS6sMFpcXj6+F+SOKDFAN4j0YhTH1yqUQiYbFqJ8yfp+7MivhmVRAQcjDw+wwiEoLrO0vi4t7hvba70YIcMAsajdcSfpEmMJgF1VjJdy5dvDsTjRkUWePVOFEEYTnNGQVQwKBgQC+MktG0RN/3k8Pi90AYcOTchNA4lgsBfmGd98V8DB+aDYck/2q0ZZlcJ2ZmSHa/dRWfQUV6RVR2aQ4p48Q8X+PjnSpCi4jpSY0ZWuMW9+DXNNJo0Lh9WXMzvMXdO2JP+705cbghLugCcszclFxWoII/W8L1WWENOjzpocmeADmfwKBgQC4g4IO3JI5Rp8AAEvH+yexUG9f+RFtDOyPFtA8dAQYdmwNGo21b9ko2ZUQ1Sovf6s6MkLfbXYhH09N+f86j0Qh+iEMJE40TcxQwuMrYSQoghHUy/LtOKzwBE5cZHrkB/12sAMVjj+8ZYv8YwxwHYyh/LLMzXMnyMOu0kvmlmKzAQKBgEtHNrohuFkM0TfzAJbNGw55wRsWOxW5i6hoO3jAZ0Ew1/H5tRXt/FvL9eS8UkUN4AQXWXLxnQmXXcM6topbO0TDenMJX3emPvfQCIA2QMIKdGoZ3zf128PzSQ3Irtd64YY2h7+HaYePOMj0/z0hOIR8Yn5JiPOJyYXeLHHSX3DbAoGAWlYtljDDZ6IQAD6AuK9eLx78BsxWX7ckhpPJRpj8P9+WiunyH+/EAB+FJ+D1LgWSeHXQUkQRnjknbe5vacTkfb433dcqjE76naiOqkA6aXHFXmjdTmslBHE4o+1c8DouAdyDWCAe7LxKEII18bPvcaW4sBEJ8gpTYpaxdenENts=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlkwTPuGqa67Qd59+FYOTL+P97Lw3RIAlNidn25/9xTlzBzV2V2eF4A8ImmPzA4pmnpcEsrpp6eT/RzLdKiHLhGdXJhp9+KqCBq0i5m/Tp2o/HiW1eoBwTZerbbK8noAyc9+5Z5xW9HfgwHtl+nvUXWsVDporX/F0XhVjUcEIs7bHZN2dTc+nlbq5FEQdV+rXH5AapTTIv+S/MlS/+kVb3Wt2XI9omoMzO+ERGU++MWSKSiQC0JuMM65smNIHLcpe+8pz5G9u2ejvNjiRIP5jobMi6X4NPFrxBh/kCCCpfcC85jH7Q4RIVRvF6KvR0e1JKmC5+O8tNfPTKw6uUMC+PQIDAQAB"
    		;
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:63342/dzw_ui/dzw_sys_ui/view/lfr/successfully.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:63342/dzw_ui/dzw_sys_ui/view/lfr/successfully.html";

    // 签名方式
    public static String sign_type = "RSA";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "https://openapi.alipaydev.com/gateway.do";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
