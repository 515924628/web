package cangku;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by zpy on 14/10/15.
 *
 */
public class CangKuAction implements Action,ModelDriven<HuoWuBean> {

	private HuoWuBean huowu = new HuoWuBean();

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public HuoWuBean getModel() {
		return huowu;
	}
}
