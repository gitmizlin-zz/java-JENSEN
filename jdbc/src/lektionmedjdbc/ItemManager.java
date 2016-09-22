package lektionmedjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemManager {	
	
	public static Item getItem(ResultSet rs) throws SQLException {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setOwner(rs.getInt("owner"));
		return item;
	}
}