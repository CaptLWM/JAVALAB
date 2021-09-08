package sec11.exam02_static_final;

public class Earth {
	// 상수
	// 상수는 관례적으로 대문자로 작성
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		// Math.PI는 자바에 내장된 PI
	}
}
