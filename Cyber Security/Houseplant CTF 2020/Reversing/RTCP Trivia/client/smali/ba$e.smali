.class final Lba$e;
.super Lap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lba;


# direct methods
.method public constructor <init>(Lba;Landroid/content/Context;Laj;Landroid/view/View;)V
    .locals 6

    iput-object p1, p0, Lba$e;->d:Lba;

    sget v5, Lb$a;->actionOverflowMenuStyle:I

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lap;-><init>(Landroid/content/Context;Laj;Landroid/view/View;ZI)V

    const p2, 0x800005

    iput p2, p0, Lap;->b:I

    iget-object p1, p1, Lba;->p:Lba$f;

    invoke-virtual {p0, p1}, Lba$e;->a(Laq$a;)V

    return-void
.end method


# virtual methods
.method protected final d()V
    .locals 2

    iget-object v0, p0, Lba$e;->d:Lba;

    invoke-static {v0}, Lba;->a(Lba;)Laj;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lba$e;->d:Lba;

    invoke-static {v0}, Lba;->b(Lba;)Laj;

    move-result-object v0

    invoke-virtual {v0}, Laj;->close()V

    :cond_0
    iget-object v0, p0, Lba$e;->d:Lba;

    const/4 v1, 0x0

    iput-object v1, v0, Lba;->m:Lba$e;

    invoke-super {p0}, Lap;->d()V

    return-void
.end method
