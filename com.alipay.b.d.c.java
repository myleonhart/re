// Java file translated from smali

public final class com.alipay.b.d.c;

public static java.util.Map a(android.content.Context context) {
	com.alipay.c.a.a.b.b v6 = com.alipay.c.a.a.b.b.a();
	java.util.HashMap v7 = new java.util.HashMap();
	com.alipay.b.f.f v5 = com.alipay.b.f.e.a(context);
	String v0 = com.alipay.c.a.a.b.b.a(context);
	String v1 = com.alipay.c.a.a.b.b.b(context);
	String v2 = com.alipay.c.a.a.b.b.l(context);
	String v3 = com.alipay.c.a.a.b.b.o(context);
	String v4 = com.alipay.c.a.a.b.b.n(context);
	if (v5 == 0) {
		v5 = v4;
		v4 = v3;
		v3 = v2;
		v2 = v1;
		v1 = v0;
		// => :goto_a5
	}
	else {
		if (com.alipay.c.a.a.a.a.a(v0) != 0) {
			v0 = v5.a();
		if (com.alipay.c.a.a.a.a.a(v1) != 0) {
			v1 = v5.b();
		}
		if (com.alipay.c.a.a.a.a.c(v2)!= 0){
			v2 = v5.c();
		}
		if (com.alipay.c.a.a.a.a.c(v3)!= 0){
			v3 = v5.d();
		}
		if (com.alipay.c.a.a.a.a.c(v4)!= 0){
			v3 = v4.d();
		}
		v5 = v4;
		v4 = v3;
		v3 = v2;
		v2 = v1;
		v1 = v0;
	}
	com.alipay.b.f.f v0 = new com.alipay.b.f.f(v1, v2, v3, v4, v5);
	if (context == 0) { //:cond_a5 => :goto_a5
		try{
			org.json.JSONObject v8 = new org.json.JSONObject();				
			v8.put("imei", v0.a());
			v8.put("imsi", v0.b());
			v8.put("mac", v0.c());
			v8.put("bluetoothmac", v0.d());
			v8.put("gsi", v0.e());
			String v0 = v8.toString();
			com.alipay.b.h.a.a("device_feature_file_name", "device_feature_file_key", v0);
			com.alipay.b.h.a.a(context, "device_feature_prefs_name", "device_feature_prefs_name", v0);
		}
		catch Exception (Throwable v0) {
			com.alipay.b.c.a.a(v0);
		}
		v7.put("AD1", v1);
		v7.put("AD2", v2);
		v7.put("AD3", com.alipay.c.a.a.b.b.g(context));
		v7.put("AD5", com.alipay.c.a.a.b.b.i(context));
		v7.put("AD6", com.alipay.c.a.a.b.b.j(context));
		v7.put("AD7", com.alipay.c.a.a.b.b.k(context));
		v7.put("AD8", v3);
		v7.put("AD9", com.alipay.c.a.a.b.b.m(context));
		v7.put("AD10", v5);
		v7.put("AD11", com.alipay.c.a.a.b.b.d());
		v7.put("AD12", com.alipay.c.a.a.b.b.e());
		v7.put("AD13", com.alipay.c.a.a.b.b.f());
		v7.put("AD14", com.alipay.c.a.a.b.b.h());
		v7.put("AD15", com.alipay.c.a.a.b.b.i());
		v7.put("AD16", com.alipay.c.a.a.b.b.j());
		v7.put("AD17", "");
		v7.put("AD18", v4);
		v7.put("AD19", com.alipay.c.a.a.b.b.p(context));
		v7.put("AD20", com.alipay.c.a.a.b.b.k());
		v7.put("AD21", com.alipay.c.a.a.b.b.f(context));
		v7.put("AD22", "");
		v7.put("AD23", com.alipay.c.a.a.b.b.l());
		v7.put("AD24", com.alipay.c.a.a.a.a.f(com.alipay.c.a.a.b.b.h(context)));
		v7.put("AD26", com.alipay.c.a.a.b.b.e(context));
		v7.put("AD27", com.alipay.c.a.a.b.b.q());
		v7.put("AD28", com.alipay.c.a.a.b.b.s());
		v7.put("AD29", com.alipay.c.a.a.b.b.u());
		v7.put("AD30", com.alipay.c.a.a.b.b.r());
		v7.put("AD31", com.alipay.c.a.a.b.b.t());
		v7.put("AD32", com.alipay.c.a.a.b.b.o());
		v7.put("AD33", com.alipay.c.a.a.b.b.p());
		v7.put("AD34", com.alipay.c.a.a.b.b.s(context));
		v7.put("AD35", com.alipay.c.a.a.b.b.t());
		v7.put("AD36", com.alipay.c.a.a.b.b.r(context));
		v7.put("AD37", com.alipay.c.a.a.b.b.n());
		v7.put("AD38", com.alipay.c.a.a.b.b.m());
		v7.put("AD39", com.alipay.c.a.a.b.b.c(context));
		v7.put("AD40", com.alipay.c.a.a.b.b.d(context));
		v7.put("AD41", com.alipay.c.a.a.b.b.b());
		v7.put("AD42", com.alipay.c.a.a.b.b.c());
		v7.put("AL3", com.alipay.c.a.a.b.b.q(context));
		return v7;
	}
}
