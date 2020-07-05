.class final Lba$b;
.super Landroidx/appcompat/view/menu/ActionMenuItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lba;


# direct methods
.method constructor <init>(Lba;)V
    .locals 0

    iput-object p1, p0, Lba$b;->a:Lba;

    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lau;
    .locals 1

    iget-object v0, p0, Lba$b;->a:Lba;

    iget-object v0, v0, Lba;->n:Lba$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lba$b;->a:Lba;

    iget-object v0, v0, Lba;->n:Lba$a;

    invoke-virtual {v0}, Lba$a;->a()Lao;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
