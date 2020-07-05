.class public abstract Lhj;
.super Landroid/widget/BaseAdapter;

# interfaces
.implements Landroid/widget/Filterable;
.implements Lhk$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj$b;,
        Lhj$a;
    }
.end annotation


# instance fields
.field protected b:Z

.field protected c:Z

.field protected d:Landroid/database/Cursor;

.field protected e:Landroid/content/Context;

.field protected f:I

.field protected g:Lhj$a;

.field protected h:Landroid/database/DataSetObserver;

.field protected i:Lhk;

.field protected j:Landroid/widget/FilterQueryProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhj;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhj;->b:Z

    iput-object p1, p0, Lhj;->e:Landroid/content/Context;

    const/4 p1, -0x1

    iput p1, p0, Lhj;->f:I

    new-instance p1, Lhj$a;

    invoke-direct {p1, p0}, Lhj$a;-><init>(Lhj;)V

    iput-object p1, p0, Lhj;->g:Lhj$a;

    new-instance p1, Lhj$b;

    invoke-direct {p1, p0}, Lhj$b;-><init>(Lhj;)V

    iput-object p1, p0, Lhj;->h:Landroid/database/DataSetObserver;

    return-void
.end method


# virtual methods
.method public final a()Landroid/database/Cursor;
    .locals 1

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    return-object v0
.end method

.method public a(Ljava/lang/CharSequence;)Landroid/database/Cursor;
    .locals 1

    iget-object v0, p0, Lhj;->j:Landroid/widget/FilterQueryProvider;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->j:Landroid/widget/FilterQueryProvider;

    invoke-interface {v0, p1}, Landroid/widget/FilterQueryProvider;->runQuery(Ljava/lang/CharSequence;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    return-object p1
.end method

.method public abstract a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public a(Landroid/database/Cursor;)V
    .locals 2

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lhj;->g:Lhj$a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lhj;->g:Lhj$a;

    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    :cond_1
    iget-object v1, p0, Lhj;->h:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhj;->h:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_2
    iput-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz p1, :cond_5

    iget-object v1, p0, Lhj;->g:Lhj$a;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhj;->g:Lhj$a;

    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V

    :cond_3
    iget-object v1, p0, Lhj;->h:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lhj;->h:Landroid/database/DataSetObserver;

    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_4
    const-string v1, "_id"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lhj;->f:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhj;->b:Z

    invoke-virtual {p0}, Lhj;->notifyDataSetChanged()V

    goto :goto_0

    :cond_5
    const/4 p1, -0x1

    iput p1, p0, Lhj;->f:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lhj;->b:Z

    invoke-virtual {p0}, Lhj;->notifyDataSetInvalidated()V

    :goto_0
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_6
    return-void
.end method

.method public abstract a(Landroid/view/View;Landroid/database/Cursor;)V
.end method

.method public b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lhj;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final b()V
    .locals 1

    iget-boolean v0, p0, Lhj;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->requery()Z

    move-result v0

    iput-boolean v0, p0, Lhj;->b:Z

    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    iget-boolean v0, p0, Lhj;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Lhj;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    if-nez p2, :cond_0

    iget-object p1, p0, Lhj;->e:Landroid/content/Context;

    iget-object p2, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-virtual {p0, p1, p2, p3}, Lhj;->b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    :cond_0
    iget-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-virtual {p0, p2, p1}, Lhj;->a(Landroid/view/View;Landroid/database/Cursor;)V

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    iget-object v0, p0, Lhj;->i:Lhk;

    if-nez v0, :cond_0

    new-instance v0, Lhk;

    invoke-direct {v0, p0}, Lhk;-><init>(Lhk$a;)V

    iput-object v0, p0, Lhj;->i:Lhk;

    :cond_0
    iget-object v0, p0, Lhj;->i:Lhk;

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lhj;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    iget-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 3

    iget-boolean v0, p0, Lhj;->b:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    iget v0, p0, Lhj;->f:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    return-wide v1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Lhj;->b:Z

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "this should only be called when the cursor is valid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "couldn\'t move cursor to position "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    if-nez p2, :cond_2

    iget-object p1, p0, Lhj;->e:Landroid/content/Context;

    iget-object p2, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-virtual {p0, p1, p2, p3}, Lhj;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    :cond_2
    iget-object p1, p0, Lhj;->d:Landroid/database/Cursor;

    invoke-virtual {p0, p2, p1}, Lhj;->a(Landroid/view/View;Landroid/database/Cursor;)V

    return-object p2
.end method

.method public hasStableIds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
