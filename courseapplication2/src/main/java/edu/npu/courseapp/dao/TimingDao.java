package edu.npu.courseapp.dao;

import java.util.List;



import edu.npu.courseapp.domain.Timings;

public interface TimingDao {
	public List<Timings> getTimingsList();
	public void deleteAlltimings(Integer id);
}
