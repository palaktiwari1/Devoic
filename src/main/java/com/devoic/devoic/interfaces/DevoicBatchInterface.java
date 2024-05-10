package com.devoic.devoic.interfaces;

import java.util.List;

import com.devoic.devoic.model.DevoicBatch;

public interface DevoicBatchInterface {
List<DevoicBatch> dblist();
DevoicBatch Savedb(DevoicBatch devoicbatch);
}
