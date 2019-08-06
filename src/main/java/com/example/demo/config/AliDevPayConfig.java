package com.example.demo.config;




    /**
     * @ClassName: AliPayConfig
     * @Description: 需要传给支付宝SDK的公共基本参数
     * @author: Linn
     * @Date: 2019/4/3 9:22
     */
    public class AliDevPayConfig {

        /**
         * 1.商户appid 这个就是在沙箱环境下你看到你的appId的那一串数字
         */
        public String APPID = "2016100200644894";

        /**
         * 私钥 pkcs8格式的 这个就是我上面说的应用私钥生成 注意这里是私钥
         */
        public static String RSA_PRIVATE_KEY ="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCsddtWq+ty+XdZhvNFRrc3I8R3wuVEAG34gMdbyRMuQL4ln6ae0rNpHkpM4/xbxM8zJGF6RafP/kahHBsGFLS+Iqcl1d1nIiFTKJwfQ1XZapeVP+H7vW8v8dcm1K6R8rFmJHqJiap+LPtzQ1X2gauJOKk+4+UniErwpcLONebPxKh7EIodFq+tiEvHlSEIVHRWwRFSdvybPjTHpXfJfFAk67MJMWv0Td2K8TBWq06a8isQwWyjR0l3XoI49jkU088E0SYC1QUifd13vJzpPot8+noKX2YMAslAwUtOEN2LyvlBsueCI8UbpG6K5TIvUFschVZZlGgUvi8RVTZn8+NxAgMBAAECggEAcuTNrI86e82A2q8SMOvssZptkE/SR5x1pyG8LwTld2IAi7Yx3guHJRfd7h3RCR4z3+Fz4262XtYLHdhIlKOEykrxyj4Rk1zkkK80W4uTjRX7SJ5XokvQ4EMg0CjO6EKkNuVEkY6afBbhqieJBIHc0r1h25keGFkve+UixBia3X0PUF13LxY3orEbK5rX8D5NJMpWW6NOON3EBYTczyQlrnrkGELTpSWA5zn7g5vtvuNg0XFKicKM3Ol248Z0C/uW1H6+gYLnnNOM/1UFJquRqVtE6G2ZdEM+lFa6tAzEbqKK/kVXmFGEPjVb8j02Ml7qZL6Czz9mYjq3GZZv1L3mMQKBgQDvqpGwivZEhWbNtn45+i6NfbARRg89rKmDcylcVGgClwdc5DQKVmqPAJBpadB6gsAhRIJHwtVI2Z78FYuCkgQSGhEoJuVRCNIex3eFJqvIe9N8gbFmcNDoomHGAPqaM5PHgxBES0ryh1u3RvcOc7vwS12lHMUWvpw71ZjuKOFcHQKBgQC4NsD0vQVF2shvSvRwv/PzFY5LGv1JItjL1ipSv69WRPdNFC+T+67jWqam9ek9ETejtkUo85OyCeVVAgRkfeZuJG4oIea/2542mcooqnn+M43bBKJIvx2S03nJzdNvgUnfDIotKdXkulnuBo07u+DM8rkrsfVeAOP798yq93b8ZQKBgQDVaqdXdTb9J2m3L5XRnPYNaun5R9DUk8dTVZ50KHmCLOkSj+fDeNZkxxTRubc7EOlz9mSo8FcrCxbm1Wyo9cuILwwuHAzCDz/ExsyolhoMai+WRIsrdLSjI847Gq4N2HX1CMHYfs+bjmtelmPzy52Eyif2mtrqeQv4wCjxkxezBQKBgFH2Ep4Rp9HvyPQzjlTIIxtJwPjLtlwfBASVcllE7hddMgb6bzzRY3vGrpVknnTMP0w44caZsWIqov3Smu+3UJo63UQ/6TH93gP/IwI673JZr8j949KoLdlQ/EP8rxFSnfJ+2s/DaGaPP0n3Yklsi1XEvPyi/j/n94f5NffviOI9AoGBAJ1UGfLt3ptX+yNxztNXRhMWYZla01X748mXphwn4JbZRffMogOntJ+mOiyDKkxjr2UtZmS9lmw79UCpIEuU5VXAyDGwMOP46Dy2F5C0zvpp57VKHufCSRjbH3+Ki+n0oo+o6skjDRGBYnd1SFV5L62Ivto/DK3hSlPv1yR2YNPt";

        /**
         * 3.支付宝公钥 这个就是你把生成的应用公钥在沙箱网页哪里输入后,就可以查看到支付宝公钥..把看到的支付宝公钥copy过来放这里就ok
         */
        public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhCiF6iUTH1VrN0P18KjQdNSxJhp/tnu8bEjd6ZoGXPdIYNoJ9NIQK9FzsfV2x/yTedwsknlC7bboKeXfiZoI5wXYsooxX8Sq+EN8gZNzQ0dcESAupAbm4gwr1Vz8J9jgmYb/LTvYVfPCwjkVF5UbHMhRSQTkwuUgJjZTNfhJs0Do7FUrpz28CAeQV4Z89bLCTcGXuSs7pZDZMo2tOd69V0/tVM6wnIHhhPmnKgcliCgZ4Vqj8vFCCi17ebRVpcgu8nEEChQObWgn488jI79WbBQTFyRGiDZMHdkdqRkQnkQTo4Ybji8NVQqgXfGe5GyM2k0gqFE/mtQKgLC1r5W3bQIDAQAB";

        /**
         * 4.服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
         */
//这个着重讲一下..支付完成后,支付宝会通过这个url请求到你的服务端..
//这个url一定是要公网可以访问才行...如果需要测试的话..我后面有讲到..
//这里你可以先写你本地项目的url 例如:localhost:8080/项目名/访问路径
        public static String notify_url = "localhost:8080/Test01/test1";

        /**
         * 5.页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
         */
        //这里同上..不做详细说明了..
        public static String return_url = "localhost:8080/Test01/test1";

        /**
         * 正式环境支付宝网关，如果是沙箱环境需更改成https://openapi.alipaydev.com/gateway.do
         */
        public static String URL = "https://openapi.alipaydev.com/gateway.do";

        /**
         * 7.编码
         */
        public static String CHARSET = "UTF-8";

        /**
         * 私钥 pkcs8格式的
         */
        // 8.返回格式
        public static String FORMAT = "json";

        /**
         * //签名方式 加密类型
         */
        public static String SIGNTYPE = "RSA2";

        public String getAPPID() {
            return APPID;
        }
    }
