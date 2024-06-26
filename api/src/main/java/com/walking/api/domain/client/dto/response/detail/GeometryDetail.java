package com.walking.api.domain.client.dto.response.detail;

import java.util.List;
import lombok.Data;

@Data
public class GeometryDetail {
	private String type;
	private List<?> coordinates; // LineString은 2차원 배열을 사용, Point는 1차원이지만 2차원으로 통일
}
