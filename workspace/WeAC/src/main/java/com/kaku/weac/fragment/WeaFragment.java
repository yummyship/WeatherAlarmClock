package com.kaku.weac.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaku.weac.R;

/**
 * 天气fragment
 *
 * @author 咖枯
 * @version 1.0 2015
 */
public class WeaFragment extends Fragment {
    /**
     * Log tag ：WeaFragment
     */
    private static final String LOG_TAG = "WeaFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fm_wea, container, false);
        return view;
        /*
        Button readButton = (Button) view.findViewById(R.id.read_wea);
        final TextView tv = (TextView) view.findViewById(R.id.wea_prompt_tv);
        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherUtil.sendHttpRequest("http://wthrcdn.etouch.cn/WeatherApi?citykey=101030100",
                        new HttpCallbackListener() {
                            @Override
                            public void onFinish(final String response) {
                                LogUtil.i(LOG_TAG, response);
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv.setText(response);
                                        /*
                                        try {
                                            // 外部存储根路径
                                            String fileName = Environment.getExternalStorageDirectory()
                                                    .getAbsolutePath();
                                            // 录音文件路径
                                            fileName += "/WeaAlarmClock/wea.txt";
                                            File file = new File(fileName);
                                            if (!file.exists()) {
                                                file.createNewFile();
                                            }

                                            FileWriter fw = new FileWriter(file.getAbsoluteFile());
                                            BufferedWriter bw = new BufferedWriter(fw);
                                            bw.write(response);
                                            bw.close();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                    }
                                });
                            }

                            @Override
                            public void onError(final Exception e) {
                                LogUtil.e(LOG_TAG, "读取失败：" + e.toString());
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv.setText("读取失败：" + e.toString());

                                    }
                                });
                            }
                        });
            }
        });
        */
    }

}
