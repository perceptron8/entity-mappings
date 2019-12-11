package orm;

import java.time.YearMonth;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class EntityX {
	private Long id;
	private Set<YearMonth> months;
	
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Set<YearMonth> getMonths() { return months; }
	public void setMonths(Set<YearMonth> months) { this.months = months; }
}
