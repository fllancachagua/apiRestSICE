package pe.gob.bnp.person.common.application.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VO {
	public static java.util.Date getUtilDate(java.sql.Date sqlDate) {
	    if (sqlDate==null) return null;
	    return new java.util.Date(sqlDate.getTime());
	}
	
	public static java.sql.Date getSQLDate(java.util.Date utilDate) {
	    if (utilDate==null) return null;
	    return new java.sql.Date(utilDate.getTime());
	}
	
	public static InputStream byteArrayToInputStream(byte[] byteArray){
		if (byteArray==null) return null;
		return new ByteArrayInputStream(byteArray);		
	}
	
	public static byte[] getBytes(InputStream is) throws IOException {
		int len;
		int size = 1024;
		byte[] buf;
		if (is == null)
			return null;
		if (is instanceof ByteArrayInputStream) {
			size = is.available();
			buf = new byte[size];
			len = is.read(buf, 0, size);
		} else {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			buf = new byte[size];
			while ((len = is.read(buf, 0, size)) != -1)
				bos.write(buf, 0, len);
			buf = bos.toByteArray();
		}
		return buf;
	}

	public static InputStream getInputStream(byte[] byteArray) {
		if (byteArray == null)
			return null;
		return new ByteArrayInputStream(byteArray);
	}

	public static Date sumarFecha(Date fecha, int campo, int valor) {
		if (valor == 0)
			return fecha;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(campo, valor);
		return calendar.getTime();
	}

	public static String parseEncode(String data) {
		if (data == null) {
			data = "";
		}
		try {
			data = URLEncoder.encode(data, "ISO-8859-1");
			data = URLDecoder.decode(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error Encode/Decode " + e.getMessage());
			e.printStackTrace();
		}
		return data;
	}

	public static boolean isEmpty(Object obj) {
		if ((obj == null) || (obj.toString().trim().length() == 0)) {
			return true;
		}
		return false;
	}

	public static boolean isNull(Object obj) {
		if ((obj == null)) {
			return true;
		}
		return false;
	}

	public static boolean isEmptyList(List<?> obj) {
		if ((obj == null) || (obj.size() == 0)) {
			return true;
		}
		return false;
	}

	public static boolean isObjectsEquals(Object obj, Object object) {
		if (obj.equals(object)) {
			return true;
		}
		return false;
	}

	public static boolean isEquals(String obj, String object) {
		if (obj.equals(object)) {
			return true;
		}
		return false;
	}

	public static String getLike(String obj, Boolean sw) {

		if (sw) {
			return obj;
		} else {
			return "%" + obj + "%";
		}
	}

	public static String getVoid(String obj) {

		if (obj == null) {
			return "";
		} else {
			return obj;
		}
	}

	public static String getEmpty(String obj) {

		if (obj == null) {
			return "";
		} else {
			return obj;
		}
	}

	public static String getString(String obj) {
		if (obj == null) {
			return "";
		} else {
			return obj;
		}
	}

	public static Integer getInteger(Integer obj) {
		if (obj == null) {
			return 0;
		} else {
			return obj;
		}
	}

	public static String encodeURL(String input) {
		StringBuilder resultStr = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (isUnsafe(ch)) {
				resultStr.append('%');
				resultStr.append(toHex(ch / 16));
				resultStr.append(toHex(ch % 16));
			} else {
				resultStr.append(ch);
			}
		}
		return resultStr.toString();
	}

	private static boolean isUnsafe(char ch) {
		if (ch > 128 || ch < 0)
			return true;
		return " %$&+,/:;=?@<>#%".indexOf(ch) >= 0;
	}

	private static char toHex(int ch) {
		return (char) (ch < 10 ? '0' + ch : 'A' + ch - 10);
	}

	public static String getParseLike(Object obj, Boolean sw) {
		return isEmpty(obj) ? "%" : getLike(obj.toString(), sw);
	}

	public static Boolean oldLike(String val) {
		if (!isEmpty(val)) {
			return val.equals("%") || val.equals("%%") || val.equals("%%%");
		}
		return false;
	}

	public static boolean validateEmail(String email) {
		final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		// Compiles the given regular expression into a pattern.
		Pattern pattern = Pattern.compile(PATTERN_EMAIL);

		// Match the given input against this pattern
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static String convertNameFile(String fileNameComplete) {
		StringBuilder fileNameFull = new StringBuilder();

		String fileName = fileNameComplete.substring(0,
				fileNameComplete.lastIndexOf("."));
		String extension = fileNameComplete.substring(fileNameComplete
				.lastIndexOf(".") + 1);

		Date fechaHora = new Date();

		SimpleDateFormat formatDia = new SimpleDateFormat("dd");
		SimpleDateFormat formatMes = new SimpleDateFormat("MM");
		SimpleDateFormat formatAnio = new SimpleDateFormat("yyyy");

		String dia = formatDia.format(fechaHora);
		String mes = formatMes.format(fechaHora).toUpperCase();
		String anio = formatAnio.format(fechaHora);

		SimpleDateFormat formatHora = new SimpleDateFormat("HH");
		SimpleDateFormat formatMin = new SimpleDateFormat("mm");
		SimpleDateFormat formatSeg = new SimpleDateFormat("ss");

		String hh = formatHora.format(fechaHora);
		String mm = formatMin.format(fechaHora);
		String ss = formatSeg.format(fechaHora);

		fileNameFull.append(fileName);

		fileNameFull.append("_");
		fileNameFull.append(dia);
		fileNameFull.append("-");
		fileNameFull.append(mes);
		fileNameFull.append("-");
		fileNameFull.append(anio);

		fileNameFull.append("_");
		fileNameFull.append(hh);
		fileNameFull.append("-");
		fileNameFull.append(mm);
		fileNameFull.append("-");
		fileNameFull.append(ss);
		fileNameFull.append(".");
		fileNameFull.append(extension);

		return fileNameFull.toString();
	}


}
