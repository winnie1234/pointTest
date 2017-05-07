package com.point.source.data;

import java.util.Date;

import com.point.enums.PointAction;
import com.point.enums.PointCause;
import com.point.enums.PointStatus;

public class DealEntity {

	public int dealId;
	public Date dealDate;
	public int point;
	// freezing/avaliable
	public PointStatus pointStatus;
	public int userId;
	public int corpId;
	public Date validateDate;
	public String description;
	// add/minus
	public PointAction pointAction;
	public PointCause pointCause;
}
