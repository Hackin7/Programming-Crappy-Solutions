package a.f.b.i;

import a.f.b.d;
import a.f.b.h;
import a.f.b.i.e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public class b {
    public static void b(f constraintWidgetContainer, d system, ArrayList<e> arrayList, int orientation) {
        c[] chainsArray;
        int chainsSize;
        int offset;
        if (orientation == 0) {
            offset = 0;
            chainsSize = constraintWidgetContainer.y0;
            chainsArray = constraintWidgetContainer.B0;
        } else {
            offset = 2;
            chainsSize = constraintWidgetContainer.z0;
            chainsArray = constraintWidgetContainer.A0;
        }
        for (int i = 0; i < chainsSize; i++) {
            c first = chainsArray[i];
            first.a();
            if (arrayList == null || arrayList.contains(first.f601a)) {
                a(constraintWidgetContainer, system, orientation, offset, first);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:297:0x063f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0653  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x068a A[ADDED_TO_REGION] */
    public static void a(f container, d system, int orientation, int offset, c chainHead) {
        boolean isChainPacked;
        boolean isChainSpread;
        boolean done;
        boolean isChainSpreadInside;
        e widget;
        e widget2;
        ArrayList<ConstraintWidget> listMatchConstraints;
        h beginTarget;
        h endTarget;
        d end;
        d end2;
        d endTarget2;
        int endPointsStrength;
        e previousVisibleWidget;
        e widget3;
        e next;
        h beginNext;
        h beginNextTarget;
        d beginNextAnchor;
        e next2;
        e previousVisibleWidget2;
        e widget4;
        e next3;
        int nextMargin;
        h beginTarget2;
        h beginNextTarget2;
        h beginNext2;
        d beginNextAnchor2;
        int margin1;
        int margin2;
        float bias;
        e widget5;
        int count;
        ArrayList<ConstraintWidget> listMatchConstraints2;
        e firstMatchConstraintsWidget;
        int margin;
        e previousMatchConstraintsWidget;
        float totalWeights;
        e next4;
        int strength;
        e first = chainHead.f601a;
        e last = chainHead.f603c;
        e firstVisibleWidget = chainHead.f602b;
        e lastVisibleWidget = chainHead.f604d;
        e head = chainHead.f605e;
        float totalWeights2 = chainHead.k;
        e firstMatchConstraintsWidget2 = chainHead.f606f;
        e previousMatchConstraintsWidget2 = chainHead.f607g;
        boolean isWrapContent = container.R[orientation] == e.a.WRAP_CONTENT;
        if (orientation == 0) {
            isChainSpread = head.i0 == 0;
            boolean isChainSpreadInside2 = head.i0 == 1;
            done = false;
            isChainPacked = head.i0 == 2;
            widget = first;
            isChainSpreadInside = isChainSpreadInside2;
        } else {
            isChainSpread = head.j0 == 0;
            boolean isChainSpreadInside3 = head.j0 == 1;
            done = false;
            isChainPacked = head.j0 == 2;
            widget = first;
            isChainSpreadInside = isChainSpreadInside3;
        }
        while (!done) {
            d begin = widget.O[offset];
            int strength2 = 4;
            if (isChainPacked) {
                strength2 = 1;
            }
            int margin3 = begin.e();
            boolean isSpreadOnly = widget.R[orientation] == e.a.MATCH_CONSTRAINT && widget.q[orientation] == 0;
            d dVar = begin.f613f;
            if (dVar == null || widget == first) {
                margin = margin3;
            } else {
                margin = margin3 + dVar.e();
            }
            if (!(!isChainPacked || widget == first || widget == firstVisibleWidget)) {
                strength2 = 8;
            }
            d dVar2 = begin.f613f;
            if (dVar2 != null) {
                if (widget == firstVisibleWidget) {
                    totalWeights = totalWeights2;
                    previousMatchConstraintsWidget = previousMatchConstraintsWidget2;
                    system.h(begin.i, dVar2.i, margin, 6);
                } else {
                    totalWeights = totalWeights2;
                    previousMatchConstraintsWidget = previousMatchConstraintsWidget2;
                    system.h(begin.i, dVar2.i, margin, 8);
                }
                if (!isSpreadOnly || isChainPacked) {
                    strength = strength2;
                } else {
                    strength = 5;
                }
                system.e(begin.i, begin.f613f.i, margin, strength);
            } else {
                totalWeights = totalWeights2;
                previousMatchConstraintsWidget = previousMatchConstraintsWidget2;
            }
            if (isWrapContent) {
                if (widget.O() != 8 && widget.R[orientation] == e.a.MATCH_CONSTRAINT) {
                    d[] dVarArr = widget.O;
                    system.h(dVarArr[offset + 1].i, dVarArr[offset].i, 0, 5);
                }
                system.h(widget.O[offset].i, container.O[offset].i, 0, 8);
            }
            d nextAnchor = widget.O[offset + 1].f613f;
            if (nextAnchor != null) {
                e next5 = nextAnchor.f611d;
                d[] dVarArr2 = next5.O;
                next4 = (dVarArr2[offset].f613f == null || dVarArr2[offset].f613f.f611d != widget) ? null : next5;
            } else {
                next4 = null;
            }
            if (next4 != null) {
                widget = next4;
            } else {
                done = true;
            }
            totalWeights2 = totalWeights;
            previousMatchConstraintsWidget2 = previousMatchConstraintsWidget;
        }
        float totalWeights3 = totalWeights2;
        if (!(lastVisibleWidget == null || last.O[offset + 1].f613f == null)) {
            d end3 = lastVisibleWidget.O[offset + 1];
            if ((lastVisibleWidget.R[orientation] == e.a.MATCH_CONSTRAINT && lastVisibleWidget.q[orientation] == 0) && !isChainPacked) {
                d dVar3 = end3.f613f;
                if (dVar3.f611d == container) {
                    system.e(end3.i, dVar3.i, -end3.e(), 5);
                    system.j(end3.i, last.O[offset + 1].f613f.i, -end3.e(), 6);
                }
            }
            if (isChainPacked) {
                d dVar4 = end3.f613f;
                if (dVar4.f611d == container) {
                    system.e(end3.i, dVar4.i, -end3.e(), 4);
                }
            }
            system.j(end3.i, last.O[offset + 1].f613f.i, -end3.e(), 6);
        }
        if (isWrapContent) {
            h hVar = container.O[offset + 1].i;
            d[] dVarArr3 = last.O;
            system.h(hVar, dVarArr3[offset + 1].i, dVarArr3[offset + 1].e(), 8);
        }
        ArrayList<ConstraintWidget> listMatchConstraints3 = chainHead.h;
        if (listMatchConstraints3 != null) {
            int count2 = listMatchConstraints3.size();
            if (count2 > 1) {
                e lastMatch = null;
                float lastWeight = 0.0f;
                if (chainHead.q && !chainHead.s) {
                    totalWeights3 = (float) chainHead.j;
                }
                int i = 0;
                while (i < count2) {
                    e match = (e) listMatchConstraints3.get(i);
                    float currentWeight = match.k0[orientation];
                    if (currentWeight >= 0.0f) {
                        count = count2;
                        widget5 = widget;
                        listMatchConstraints2 = listMatchConstraints3;
                    } else if (chainHead.s) {
                        d[] dVarArr4 = match.O;
                        count = count2;
                        widget5 = widget;
                        listMatchConstraints2 = listMatchConstraints3;
                        system.e(dVarArr4[offset + 1].i, dVarArr4[offset].i, 0, 4);
                        firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
                        i++;
                        firstMatchConstraintsWidget2 = firstMatchConstraintsWidget;
                        listMatchConstraints3 = listMatchConstraints2;
                        count2 = count;
                        widget = widget5;
                    } else {
                        count = count2;
                        widget5 = widget;
                        listMatchConstraints2 = listMatchConstraints3;
                        currentWeight = 1.0f;
                    }
                    if (currentWeight == 0.0f) {
                        d[] dVarArr5 = match.O;
                        firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
                        system.e(dVarArr5[offset + 1].i, dVarArr5[offset].i, 0, 8);
                    } else {
                        firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
                        if (lastMatch != null) {
                            d[] dVarArr6 = lastMatch.O;
                            h begin2 = dVarArr6[offset].i;
                            h end4 = dVarArr6[offset + 1].i;
                            d[] dVarArr7 = match.O;
                            h nextBegin = dVarArr7[offset].i;
                            h nextEnd = dVarArr7[offset + 1].i;
                            a.f.b.b row = system.r();
                            row.k(lastWeight, totalWeights3, currentWeight, begin2, end4, nextBegin, nextEnd);
                            system.d(row);
                        }
                        lastWeight = currentWeight;
                        lastMatch = match;
                    }
                    i++;
                    firstMatchConstraintsWidget2 = firstMatchConstraintsWidget;
                    listMatchConstraints3 = listMatchConstraints2;
                    count2 = count;
                    widget = widget5;
                }
                widget2 = widget;
                listMatchConstraints = listMatchConstraints3;
            } else {
                widget2 = widget;
                listMatchConstraints = listMatchConstraints3;
            }
        } else {
            widget2 = widget;
            listMatchConstraints = listMatchConstraints3;
        }
        if (firstVisibleWidget != null) {
            if (firstVisibleWidget == lastVisibleWidget || isChainPacked) {
                d begin3 = first.O[offset];
                d end5 = last.O[offset + 1];
                d dVar5 = begin3.f613f;
                h beginTarget3 = dVar5 != null ? dVar5.i : null;
                d dVar6 = end5.f613f;
                h endTarget3 = dVar6 != null ? dVar6.i : null;
                d begin4 = firstVisibleWidget.O[offset];
                d end6 = lastVisibleWidget.O[offset + 1];
                if (beginTarget3 != null && endTarget3 != null) {
                    if (orientation == 0) {
                        bias = head.c0;
                    } else {
                        bias = head.d0;
                    }
                    system.c(begin4.i, beginTarget3, begin4.e(), bias, endTarget3, end6.i, end6.e(), 7);
                    if (!isChainSpread) {
                    }
                    d begin5 = firstVisibleWidget.O[offset];
                    d end7 = lastVisibleWidget.O[offset + 1];
                    d dVar7 = begin5.f613f;
                    if (dVar7 == null) {
                    }
                    d dVar8 = end7.f613f;
                    if (dVar8 == null) {
                    }
                    if (last == lastVisibleWidget) {
                    }
                    if (firstVisibleWidget != lastVisibleWidget) {
                    }
                    if (beginTarget == null) {
                    }
                } else if ((!isChainSpread || isChainSpreadInside) && firstVisibleWidget != null && firstVisibleWidget != lastVisibleWidget) {
                    d begin52 = firstVisibleWidget.O[offset];
                    d end72 = lastVisibleWidget.O[offset + 1];
                    d dVar72 = begin52.f613f;
                    beginTarget = dVar72 == null ? dVar72.i : null;
                    d dVar82 = end72.f613f;
                    h endTarget4 = dVar82 == null ? dVar82.i : null;
                    if (last == lastVisibleWidget) {
                        d dVar9 = last.O[offset + 1].f613f;
                        endTarget = dVar9 != null ? dVar9.i : null;
                    } else {
                        endTarget = endTarget4;
                    }
                    if (firstVisibleWidget != lastVisibleWidget) {
                        d[] dVarArr8 = firstVisibleWidget.O;
                        begin52 = dVarArr8[offset];
                        end = dVarArr8[offset + 1];
                    } else {
                        end = end72;
                    }
                    if (beginTarget == null && endTarget != null) {
                        system.c(begin52.i, beginTarget, begin52.e(), 0.5f, endTarget, end.i, lastVisibleWidget.O[offset + 1].e(), 5);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        if (!isChainSpread || firstVisibleWidget == null) {
            int i2 = 8;
            if (isChainSpreadInside && firstVisibleWidget != null) {
                int i3 = chainHead.j;
                boolean applyFixedEquality = i3 > 0 && chainHead.i == i3;
                e widget6 = firstVisibleWidget;
                e previousVisibleWidget3 = firstVisibleWidget;
                while (widget6 != null) {
                    e next6 = widget6.m0[orientation];
                    while (next6 != null && next6.O() == i2) {
                        next6 = next6.m0[orientation];
                    }
                    if (widget6 == firstVisibleWidget || widget6 == lastVisibleWidget || next6 == null) {
                        widget3 = widget6;
                        previousVisibleWidget = previousVisibleWidget3;
                        next = next6;
                    } else {
                        e next7 = next6 == lastVisibleWidget ? null : next6;
                        d beginAnchor = widget6.O[offset];
                        h begin6 = beginAnchor.i;
                        d dVar10 = beginAnchor.f613f;
                        if (dVar10 != null) {
                            h hVar2 = dVar10.i;
                        }
                        h beginTarget4 = previousVisibleWidget3.O[offset + 1].i;
                        h beginNext3 = null;
                        int beginMargin = beginAnchor.e();
                        int nextMargin2 = widget6.O[offset + 1].e();
                        if (next7 != null) {
                            d beginNextAnchor3 = next7.O[offset];
                            h beginNext4 = beginNextAnchor3.i;
                            d dVar11 = beginNextAnchor3.f613f;
                            beginNextTarget = dVar11 != null ? dVar11.i : null;
                            beginNext = beginNext4;
                            beginNextAnchor = beginNextAnchor3;
                        } else {
                            d beginNextAnchor4 = lastVisibleWidget.O[offset];
                            if (beginNextAnchor4 != null) {
                                beginNext3 = beginNextAnchor4.i;
                            }
                            beginNextAnchor = beginNextAnchor4;
                            beginNextTarget = widget6.O[offset + 1].i;
                            beginNext = beginNext3;
                        }
                        if (beginNextAnchor != null) {
                            nextMargin2 += beginNextAnchor.e();
                        }
                        int beginMargin2 = beginMargin + previousVisibleWidget3.O[offset + 1].e();
                        int strength3 = applyFixedEquality ? 8 : 4;
                        if (begin6 == null || beginTarget4 == null || beginNext == null || beginNextTarget == null) {
                            next2 = next7;
                            widget3 = widget6;
                            previousVisibleWidget = previousVisibleWidget3;
                        } else {
                            next2 = next7;
                            widget3 = widget6;
                            previousVisibleWidget = previousVisibleWidget3;
                            system.c(begin6, beginTarget4, beginMargin2, 0.5f, beginNext, beginNextTarget, nextMargin2, strength3);
                        }
                        next = next2;
                    }
                    if (widget3.O() != 8) {
                        previousVisibleWidget3 = widget3;
                    } else {
                        previousVisibleWidget3 = previousVisibleWidget;
                    }
                    widget6 = next;
                    i2 = 8;
                }
                d begin7 = firstVisibleWidget.O[offset];
                d beginTarget5 = first.O[offset].f613f;
                d end8 = lastVisibleWidget.O[offset + 1];
                d endTarget5 = last.O[offset + 1].f613f;
                if (beginTarget5 == null) {
                    endPointsStrength = 5;
                    endTarget2 = endTarget5;
                    end2 = end8;
                } else if (firstVisibleWidget != lastVisibleWidget) {
                    system.e(begin7.i, beginTarget5.i, begin7.e(), 5);
                    endPointsStrength = 5;
                    endTarget2 = endTarget5;
                    end2 = end8;
                } else if (endTarget5 != null) {
                    endPointsStrength = 5;
                    endTarget2 = endTarget5;
                    end2 = end8;
                    system.c(begin7.i, beginTarget5.i, begin7.e(), 0.5f, end8.i, endTarget5.i, end8.e(), 5);
                } else {
                    endPointsStrength = 5;
                    endTarget2 = endTarget5;
                    end2 = end8;
                }
                if (endTarget2 != null && firstVisibleWidget != lastVisibleWidget) {
                    system.e(end2.i, endTarget2.i, -end2.e(), endPointsStrength);
                }
            }
            if (!isChainSpread) {
            }
            d begin522 = firstVisibleWidget.O[offset];
            d end722 = lastVisibleWidget.O[offset + 1];
            d dVar722 = begin522.f613f;
            if (dVar722 == null) {
            }
            d dVar822 = end722.f613f;
            if (dVar822 == null) {
            }
            if (last == lastVisibleWidget) {
            }
            if (firstVisibleWidget != lastVisibleWidget) {
            }
            if (beginTarget == null) {
            }
        }
        int i4 = chainHead.j;
        boolean applyFixedEquality2 = i4 > 0 && chainHead.i == i4;
        e previousVisibleWidget4 = firstVisibleWidget;
        for (e widget7 = firstVisibleWidget; widget7 != null; widget7 = next3) {
            e next8 = widget7.m0[orientation];
            while (true) {
                if (next8 == null) {
                    break;
                }
                if (next8.O() != 8) {
                    break;
                }
                next8 = next8.m0[orientation];
            }
            if (next8 != null || widget7 == lastVisibleWidget) {
                d beginAnchor2 = widget7.O[offset];
                h begin8 = beginAnchor2.i;
                d dVar12 = beginAnchor2.f613f;
                h beginTarget6 = dVar12 != null ? dVar12.i : null;
                if (previousVisibleWidget4 != widget7) {
                    beginTarget2 = previousVisibleWidget4.O[offset + 1].i;
                } else if (widget7 == firstVisibleWidget && previousVisibleWidget4 == widget7) {
                    d[] dVarArr9 = first.O;
                    beginTarget2 = dVarArr9[offset].f613f != null ? dVarArr9[offset].f613f.i : null;
                } else {
                    beginTarget2 = beginTarget6;
                }
                h beginNext5 = null;
                int beginMargin3 = beginAnchor2.e();
                int nextMargin3 = widget7.O[offset + 1].e();
                if (next8 != null) {
                    d beginNextAnchor5 = next8.O[offset];
                    beginNextAnchor2 = beginNextAnchor5;
                    beginNext2 = beginNextAnchor5.i;
                    beginNextTarget2 = widget7.O[offset + 1].i;
                } else {
                    d beginNextAnchor6 = last.O[offset + 1].f613f;
                    if (beginNextAnchor6 != null) {
                        beginNext5 = beginNextAnchor6.i;
                    }
                    beginNextAnchor2 = beginNextAnchor6;
                    beginNext2 = beginNext5;
                    beginNextTarget2 = widget7.O[offset + 1].i;
                }
                if (beginNextAnchor2 != null) {
                    nextMargin3 += beginNextAnchor2.e();
                }
                if (previousVisibleWidget4 != null) {
                    beginMargin3 += previousVisibleWidget4.O[offset + 1].e();
                }
                if (begin8 == null || beginTarget2 == null || beginNext2 == null || beginNextTarget2 == null) {
                    next3 = next8;
                    widget4 = widget7;
                    previousVisibleWidget2 = previousVisibleWidget4;
                    nextMargin = 8;
                } else {
                    if (widget7 == firstVisibleWidget) {
                        margin1 = firstVisibleWidget.O[offset].e();
                    } else {
                        margin1 = beginMargin3;
                    }
                    if (widget7 == lastVisibleWidget) {
                        margin2 = lastVisibleWidget.O[offset + 1].e();
                    } else {
                        margin2 = nextMargin3;
                    }
                    nextMargin = 8;
                    next3 = next8;
                    widget4 = widget7;
                    previousVisibleWidget2 = previousVisibleWidget4;
                    system.c(begin8, beginTarget2, margin1, 0.5f, beginNext2, beginNextTarget2, margin2, applyFixedEquality2 ? 8 : 5);
                }
            } else {
                next3 = next8;
                widget4 = widget7;
                previousVisibleWidget2 = previousVisibleWidget4;
                nextMargin = 8;
            }
            if (widget4.O() != nextMargin) {
                previousVisibleWidget4 = widget4;
            } else {
                previousVisibleWidget4 = previousVisibleWidget2;
            }
        }
        if (!isChainSpread) {
        }
        d begin5222 = firstVisibleWidget.O[offset];
        d end7222 = lastVisibleWidget.O[offset + 1];
        d dVar7222 = begin5222.f613f;
        if (dVar7222 == null) {
        }
        d dVar8222 = end7222.f613f;
        if (dVar8222 == null) {
        }
        if (last == lastVisibleWidget) {
        }
        if (firstVisibleWidget != lastVisibleWidget) {
        }
        if (beginTarget == null) {
        }
    }
}
