package fengxiaowei.baselibrary.https;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fengxiaowei on 17/10/30.
 *
 * http://square.github.io/retrofit/
 */

public class RetrofitHelper {
  private static Retrofit retrofit;

  public static Retrofit getInstance() {
    return retrofit;
  }


  public static synchronized void init(String baseUrl) {
    if (retrofit == null) {
      OkHttpClient.Builder builder = new OkHttpClient.Builder();
      builder.sslSocketFactory(SSLFactoryGenerator.createAllAllowedFactory());

      retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
          .baseUrl(baseUrl)
          .client(builder.build())
          .build();
    }
  }


}
