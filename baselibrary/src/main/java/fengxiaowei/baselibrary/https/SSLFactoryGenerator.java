package fengxiaowei.baselibrary.https;


import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Created by fengxiaowei on 17/10/30.
 */
public class SSLFactoryGenerator {

  public static SSLSocketFactory createAllAllowedFactory() {
    SSLSocketFactory socketFactory = null;
    try {
      SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(null, new TrustManager[] {new AllTrustManager()}, new SecureRandom());
      socketFactory = sslContext.getSocketFactory();
    } catch (Exception e) {
      return null;
    }

    return socketFactory;
  }

  private static class AllTrustManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType)
        throws CertificateException {

    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType)
        throws CertificateException {

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
    }
  }

}
