package com.hlxd.glhdcs.util;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author unis
 *
 */
public class StringUtil {
	
	public static String str2SQL(String str)
	{
		if (str==null) {
            return "null";
        }
		int ii = str.length();
		StringBuffer sb = new StringBuffer(ii * 2);
		char ac[] = str.toCharArray();
		sb.append('\'');
		for(int i = 0; i < ac.length; i++)
		{
			switch(ac[i])
			{
				case 39: // '\''
					sb.append("\'\'");
					break;
				case 13: // '\r'
					sb.append("\' || chr(13) || \'");
					break;
				case 10: // '\n'
					sb.append("\' || chr(10) || \'");
					break;
				default:
					sb.append(ac[i]);
					break;
			}
		}
		sb.append('\'');
		
		return sb.toString();
	}
	
	public static boolean isBlank(String s)
	{
		return null == s || s.length() == 0;
	}
	
	public static String str2Html(String s)
	{
		if(isBlank(s)) {
            return "";
        } else {
            s = s.trim();
        }
		StringBuffer stringbuffer = new StringBuffer(100);
		char ac[] = s.toCharArray();
		for(int i = 0; i < ac.length; i++){
	//	int ii = (int)ac[i];
			switch(ac[i])
			{
			case 32: // ' '空格
				stringbuffer.append("&nbsp;");
				break;
			//case 13: // '\r'回车
				//stringbuffer.append("\' + chr(13) + \'");
			//	break;
			//case 10: // '\n'换行
				//stringbuffer.append("<br>");
			//	break;

			case 60: // '<'小于号
				stringbuffer.append("&lt;");
				break;

			case 62: // '>'大于号
				stringbuffer.append("&gt;");
				break;
			case 34://'"'双引号
				stringbuffer.append("&quot;");
				break;
			//case 38://'&'
			//	stringbuffer.append("&amp;");
			//	break;
			case 39://'''单引号
				stringbuffer.append("&#39;");
				break;
			default:
				stringbuffer.append(ac[i]);
				break;
			}
		}

		return stringbuffer.toString();
	}
	
	/**
	 * 把数组转换成set
	 * @param array
	 * @return
	 */
	public static Set<?> array2Set(Object[] array) {
		Set<Object> set = new TreeSet<Object>();
		for (Object id : array) {
			if(null != id){
				set.add(id);
			}
		}
		return set;
	}
}
