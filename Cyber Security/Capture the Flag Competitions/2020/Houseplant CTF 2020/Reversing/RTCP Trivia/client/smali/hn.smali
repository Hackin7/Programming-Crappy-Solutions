.class final Lhn;
.super Lhz;

# interfaces
.implements Lhv$g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhn$a;
    }
.end annotation


# instance fields
.field final a:Lhv;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhn$a;",
            ">;"
        }
    .end annotation
.end field

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:Z

.field j:Z

.field k:Ljava/lang/String;

.field l:Z

.field m:I

.field n:I

.field o:Ljava/lang/CharSequence;

.field p:I

.field q:Ljava/lang/CharSequence;

.field r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field t:Z

.field u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhv;)V
    .locals 1

    invoke-direct {p0}, Lhz;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhn;->j:Z

    const/4 v0, -0x1

    iput v0, p0, Lhn;->m:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhn;->t:Z

    iput-object p1, p0, Lhn;->a:Lhv;

    return-void
.end method

.method static a(Lhn$a;)Z
    .locals 1

    iget-object p0, p0, Lhn$a;->b:Lhp;

    if-eqz p0, :cond_0

    iget-boolean v0, p0, Lhp;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lhp;->C:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lhp;->B:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lhp;->J()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method final a(Ljava/util/ArrayList;Lhp;)Lhp;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhp;",
            ">;",
            "Lhp;",
            ")",
            "Lhp;"
        }
    .end annotation

    const/4 v0, 0x0

    move-object v1, p2

    move p2, v0

    :goto_0
    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p2, v2, :cond_6

    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn$a;

    iget v3, v2, Lhn$a;->a:I

    const/4 v4, 0x0

    const/16 v5, 0x9

    const/4 v6, 0x1

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_4

    :pswitch_1
    iget-object v3, p0, Lhn;->b:Ljava/util/ArrayList;

    new-instance v4, Lhn$a;

    invoke-direct {v4, v5, v1}, Lhn$a;-><init>(ILhp;)V

    invoke-virtual {v3, p2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    iget-object v1, v2, Lhn$a;->b:Lhp;

    goto/16 :goto_4

    :pswitch_2
    iget-object v3, v2, Lhn$a;->b:Lhp;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v3, v2, Lhn$a;->b:Lhp;

    if-ne v3, v1, :cond_5

    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    new-instance v3, Lhn$a;

    iget-object v2, v2, Lhn$a;->b:Lhp;

    invoke-direct {v3, v5, v2}, Lhn$a;-><init>(ILhp;)V

    invoke-virtual {v1, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    move-object v1, v4

    goto/16 :goto_4

    :pswitch_3
    iget-object v3, v2, Lhn$a;->b:Lhp;

    iget v7, v3, Lhp;->z:I

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v6

    move-object v9, v1

    move v1, p2

    move p2, v0

    :goto_1
    if-ltz v8, :cond_3

    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lhp;

    iget v11, v10, Lhp;->z:I

    if-ne v11, v7, :cond_2

    if-ne v10, v3, :cond_0

    move p2, v6

    goto :goto_2

    :cond_0
    if-ne v10, v9, :cond_1

    iget-object v9, p0, Lhn;->b:Ljava/util/ArrayList;

    new-instance v11, Lhn$a;

    invoke-direct {v11, v5, v10}, Lhn$a;-><init>(ILhp;)V

    invoke-virtual {v9, v1, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    move-object v9, v4

    :cond_1
    new-instance v11, Lhn$a;

    const/4 v12, 0x3

    invoke-direct {v11, v12, v10}, Lhn$a;-><init>(ILhp;)V

    iget v12, v2, Lhn$a;->c:I

    iput v12, v11, Lhn$a;->c:I

    iget v12, v2, Lhn$a;->e:I

    iput v12, v11, Lhn$a;->e:I

    iget v12, v2, Lhn$a;->d:I

    iput v12, v11, Lhn$a;->d:I

    iget v12, v2, Lhn$a;->f:I

    iput v12, v11, Lhn$a;->f:I

    iget-object v12, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v12, v1, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p1, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/2addr v1, v6

    :cond_2
    :goto_2
    add-int/lit8 v8, v8, -0x1

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    iget-object p2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 p2, v1, -0x1

    :goto_3
    move-object v1, v9

    goto :goto_4

    :cond_4
    iput v6, v2, Lhn$a;->a:I

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move p2, v1

    goto :goto_3

    :pswitch_4
    iget-object v2, v2, Lhn$a;->b:Lhp;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    add-int/2addr p2, v6

    goto/16 :goto_0

    :cond_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method

.method public final a()V
    .locals 3

    iget-object v0, p0, Lhn;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget-object v1, p0, Lhn;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lhn;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lhn;->u:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method final a(I)V
    .locals 6

    iget-boolean v0, p0, Lhn;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bump nesting in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn$a;

    iget-object v3, v2, Lhn$a;->b:Lhp;

    if-eqz v3, :cond_2

    iget-object v3, v2, Lhn$a;->b:Lhp;

    iget v4, v3, Lhp;->r:I

    add-int/2addr v4, p1

    iput v4, v3, Lhp;->r:I

    sget-boolean v3, Lhv;->a:Z

    if-eqz v3, :cond_2

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Bump nesting of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v2, Lhn$a;->b:Lhp;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lhn$a;->b:Lhp;

    iget v2, v2, Lhp;->r:I

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method final a(Lhp$c;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn$a;

    invoke-static {v1}, Lhn;->a(Lhn$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lhn$a;->b:Lhp;

    invoke-virtual {v1, p1}, Lhp;->a(Lhp$c;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lhn;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 5

    if-eqz p3, :cond_8

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lhn;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mIndex="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->m:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mCommitted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lhn;->l:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget v0, p0, Lhn;->g:I

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTransitionStyle=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lhn;->c:I

    if-nez v0, :cond_1

    iget v0, p0, Lhn;->d:I

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_2
    iget v0, p0, Lhn;->e:I

    if-nez v0, :cond_3

    iget v0, p0, Lhn;->f:I

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mPopExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_4
    iget v0, p0, Lhn;->n:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lhn;->o:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lhn;->o:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget v0, p0, Lhn;->p:I

    if-nez v0, :cond_7

    iget-object v0, p0, Lhn;->q:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lhn;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lhn;->q:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_d

    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn$a;

    iget v3, v2, Lhn$a;->a:I

    packed-switch v3, :pswitch_data_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "cmd="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v2, Lhn$a;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :pswitch_0
    const-string v3, "UNSET_PRIMARY_NAV"

    goto :goto_1

    :pswitch_1
    const-string v3, "SET_PRIMARY_NAV"

    goto :goto_1

    :pswitch_2
    const-string v3, "ATTACH"

    goto :goto_1

    :pswitch_3
    const-string v3, "DETACH"

    goto :goto_1

    :pswitch_4
    const-string v3, "SHOW"

    goto :goto_1

    :pswitch_5
    const-string v3, "HIDE"

    goto :goto_1

    :pswitch_6
    const-string v3, "REMOVE"

    goto :goto_1

    :pswitch_7
    const-string v3, "REPLACE"

    goto :goto_1

    :pswitch_8
    const-string v3, "ADD"

    goto :goto_1

    :pswitch_9
    const-string v3, "NULL"

    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  Op #"

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v2, Lhn$a;->b:Lhp;

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz p3, :cond_c

    iget v3, v2, Lhn$a;->c:I

    if-nez v3, :cond_9

    iget v3, v2, Lhn$a;->d:I

    if-eqz v3, :cond_a

    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "enterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lhn$a;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " exitAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lhn$a;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_a
    iget v3, v2, Lhn$a;->e:I

    if-nez v3, :cond_b

    iget v3, v2, Lhn$a;->f:I

    if-eqz v3, :cond_c

    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "popEnterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lhn$a;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " popExitAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v2, v2, Lhn$a;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method final a(Z)V
    .locals 6

    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn$a;

    iget-object v3, v2, Lhn$a;->b:Lhp;

    if-eqz v3, :cond_0

    iget v4, p0, Lhn;->g:I

    invoke-static {v4}, Lhv;->b(I)I

    move-result v4

    iget v5, p0, Lhn;->h:I

    invoke-virtual {v3, v4, v5}, Lhp;->a(II)V

    :cond_0
    iget v4, v2, Lhn$a;->a:I

    if-eq v4, v1, :cond_1

    packed-switch v4, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown cmd: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v2, Lhn$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v4, p0, Lhn;->a:Lhv;

    invoke-virtual {v4, v3}, Lhv;->h(Lhp;)V

    goto :goto_1

    :pswitch_1
    iget-object v4, p0, Lhn;->a:Lhv;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lhv;->h(Lhp;)V

    goto :goto_1

    :pswitch_2
    iget v4, v2, Lhn$a;->f:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    iget-object v4, p0, Lhn;->a:Lhv;

    invoke-virtual {v4, v3}, Lhv;->f(Lhp;)V

    goto :goto_1

    :pswitch_3
    iget v4, v2, Lhn$a;->e:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    iget-object v4, p0, Lhn;->a:Lhv;

    invoke-virtual {v4, v3}, Lhv;->g(Lhp;)V

    goto :goto_1

    :pswitch_4
    iget v4, v2, Lhn$a;->f:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    invoke-static {v3}, Lhv;->d(Lhp;)V

    goto :goto_1

    :pswitch_5
    iget v4, v2, Lhn$a;->e:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    invoke-static {v3}, Lhv;->e(Lhp;)V

    goto :goto_1

    :pswitch_6
    iget v4, v2, Lhn$a;->e:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    iget-object v4, p0, Lhn;->a:Lhv;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Lhv;->a(Lhp;Z)V

    goto :goto_1

    :cond_1
    iget v4, v2, Lhn$a;->f:I

    invoke-virtual {v3, v4}, Lhp;->a(I)V

    iget-object v4, p0, Lhn;->a:Lhv;

    invoke-virtual {v4, v3}, Lhv;->c(Lhp;)V

    :goto_1
    iget-boolean v4, p0, Lhn;->t:Z

    if-nez v4, :cond_2

    iget v2, v2, Lhn$a;->a:I

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    if-eqz v3, :cond_2

    iget-object v2, p0, Lhn;->a:Lhv;

    invoke-virtual {v2, v3}, Lhv;->a(Lhp;)V

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    :cond_3
    iget-boolean v0, p0, Lhn;->t:Z

    if-nez v0, :cond_4

    if-eqz p1, :cond_4

    iget-object p1, p0, Lhn;->a:Lhv;

    iget-object v0, p0, Lhn;->a:Lhv;

    iget v0, v0, Lhv;->l:I

    invoke-virtual {p1, v0, v1}, Lhv;->a(IZ)V

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method final a(Ljava/util/ArrayList;II)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;II)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne p3, p2, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    move v3, v2

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_7

    iget-object v4, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhn$a;

    iget-object v5, v4, Lhn$a;->b:Lhp;

    if-eqz v5, :cond_1

    iget-object v4, v4, Lhn$a;->b:Lhp;

    iget v4, v4, Lhp;->z:I

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    if-eqz v4, :cond_6

    if-eq v4, v3, :cond_6

    move v3, p2

    :goto_2
    if-ge v3, p3, :cond_5

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhn;

    iget-object v6, v5, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v0

    :goto_3
    if-ge v7, v6, :cond_4

    iget-object v8, v5, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lhn$a;

    iget-object v9, v8, Lhn$a;->b:Lhp;

    if-eqz v9, :cond_2

    iget-object v8, v8, Lhn$a;->b:Lhp;

    iget v8, v8, Lhp;->z:I

    goto :goto_4

    :cond_2
    move v8, v0

    :goto_4
    if-ne v8, v4, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    move v3, v4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    return v0
.end method

.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Run: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Lhn;->i:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lhn;->a:Lhv;

    iget-object p2, p1, Lhv;->g:Ljava/util/ArrayList;

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p1, Lhv;->g:Ljava/util/ArrayList;

    :cond_1
    iget-object p1, p1, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method final b(Ljava/util/ArrayList;Lhp;)Lhp;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhp;",
            ">;",
            "Lhp;",
            ")",
            "Lhp;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn$a;

    iget v2, v1, Lhn$a;->a:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object p2, v1, Lhn$a;->b:Lhp;

    goto :goto_1

    :pswitch_1
    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    :pswitch_2
    iget-object v1, v1, Lhn$a;->b:Lhp;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :pswitch_3
    iget-object v1, v1, Lhn$a;->b:Lhp;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method final b()V
    .locals 8

    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_3

    iget-object v4, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhn$a;

    iget-object v5, v4, Lhn$a;->b:Lhp;

    if-eqz v5, :cond_0

    iget v6, p0, Lhn;->g:I

    iget v7, p0, Lhn;->h:I

    invoke-virtual {v5, v6, v7}, Lhp;->a(II)V

    :cond_0
    iget v6, v4, Lhn$a;->a:I

    if-eq v6, v3, :cond_1

    packed-switch v6, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown cmd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v4, Lhn$a;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v6, p0, Lhn;->a:Lhv;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lhv;->h(Lhp;)V

    goto :goto_1

    :pswitch_1
    iget-object v6, p0, Lhn;->a:Lhv;

    invoke-virtual {v6, v5}, Lhv;->h(Lhp;)V

    goto :goto_1

    :pswitch_2
    iget v6, v4, Lhn$a;->c:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    iget-object v6, p0, Lhn;->a:Lhv;

    invoke-virtual {v6, v5}, Lhv;->g(Lhp;)V

    goto :goto_1

    :pswitch_3
    iget v6, v4, Lhn$a;->d:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    iget-object v6, p0, Lhn;->a:Lhv;

    invoke-virtual {v6, v5}, Lhv;->f(Lhp;)V

    goto :goto_1

    :pswitch_4
    iget v6, v4, Lhn$a;->c:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    invoke-static {v5}, Lhv;->e(Lhp;)V

    goto :goto_1

    :pswitch_5
    iget v6, v4, Lhn$a;->d:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    invoke-static {v5}, Lhv;->d(Lhp;)V

    goto :goto_1

    :pswitch_6
    iget v6, v4, Lhn$a;->d:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    iget-object v6, p0, Lhn;->a:Lhv;

    invoke-virtual {v6, v5}, Lhv;->c(Lhp;)V

    goto :goto_1

    :cond_1
    iget v6, v4, Lhn$a;->c:I

    invoke-virtual {v5, v6}, Lhp;->a(I)V

    iget-object v6, p0, Lhn;->a:Lhv;

    invoke-virtual {v6, v5, v1}, Lhv;->a(Lhp;Z)V

    :goto_1
    iget-boolean v6, p0, Lhn;->t:Z

    if-nez v6, :cond_2

    iget v4, v4, Lhn$a;->a:I

    if-eq v4, v3, :cond_2

    if-eqz v5, :cond_2

    iget-object v3, p0, Lhn;->a:Lhv;

    invoke-virtual {v3, v5}, Lhv;->a(Lhp;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    iget-boolean v0, p0, Lhn;->t:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lhn;->a:Lhv;

    iget-object v1, p0, Lhn;->a:Lhv;

    iget v1, v1, Lhv;->l:I

    invoke-virtual {v0, v1, v3}, Lhv;->a(IZ)V

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method final b(I)Z
    .locals 5

    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn$a;

    iget-object v4, v3, Lhn$a;->b:Lhp;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lhn$a;->b:Lhp;

    iget v3, v3, Lhp;->z:I

    goto :goto_1

    :cond_0
    move v3, v1

    :goto_1
    if-eqz v3, :cond_1

    if-ne v3, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "BackStackEntry{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhn;->m:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhn;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lhn;->k:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhn;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
